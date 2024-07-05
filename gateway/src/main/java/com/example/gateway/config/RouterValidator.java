package com.example.gateway.config;

import io.jsonwebtoken.Claims;
import lombok.RequiredArgsConstructor;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

@Component
@RequiredArgsConstructor
public class RouterValidator {

    public final JwtUtil jwtUtil;

    public static final List<String> openApiEndpoints= List.of(
            "/auth/register",
            "/auth/login",
            "/auth/role"
    );

    public static final Map<String, List<String>> apiEndpoints = Map.of(
            "/account", List.of("ROLE_ADMIN"),
            "/admin", List.of("ROLE_ADMIN"),
            "/test", List.of("ROLE_USER")
    );

    public Predicate<ServerHttpRequest> isSecured =
            request -> openApiEndpoints
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));

    public boolean hasRequiredRoles(ServerHttpRequest request, String token){
        Claims claims = jwtUtil.getAllClaimsFromToken(token);
        String path = request.getURI().getPath();
        return apiEndpoints.keySet().stream()
                .filter(path::contains)
                .findFirst()
                .map(endpoint -> apiEndpoints.get(endpoint).stream()
                        .anyMatch(claims.get("roles", List.class)::contains))
                .orElse(false);
    }

}
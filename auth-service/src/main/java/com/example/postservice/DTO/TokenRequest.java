package com.example.postservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@RequiredArgsConstructor
public class TokenRequest {

    private String accessToken;
}

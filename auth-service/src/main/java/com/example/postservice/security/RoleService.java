package com.example.postservice.security;

import com.example.postservice.DTO.RoleDTO;
import com.example.postservice.model.Role;
import com.example.postservice.repository.RoleRepository;
import jakarta.persistence.EntityExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleDTO createRole(RoleDTO roleDTO){

        if(roleRepository.findByName(roleDTO.name()).isPresent()){
            throw new EntityExistsException();
        }

        Role role = roleRepository.save(new Role(UUID.randomUUID(), roleDTO.name()));
        return new RoleDTO(role.getName());
    }
}

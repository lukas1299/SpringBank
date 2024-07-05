package com.example.postservice.repository;

import com.example.postservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {

    List<Role> findByNameIn(List<String> roles);
    Optional<Role> findByName(String name);
}

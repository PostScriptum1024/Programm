package com.example.MyUIRestObService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MyUIRestObService.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
package com.example.MyUIRestObService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MyUIRestObService.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
package ru.urfu.curs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.curs.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

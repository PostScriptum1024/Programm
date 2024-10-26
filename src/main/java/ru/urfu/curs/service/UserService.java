package ru.urfu.curs.service;

import org.springframework.stereotype.Service;
import ru.urfu.curs.dto.UserDto;
import ru.urfu.curs.entity.User;
import ru.urfu.curs.utility.RoleEnum;

import java.util.List;

@Service
public interface UserService {
    void SaveUser(UserDto user);
    User findUserByEmail(String email);
    List<User> findAllUsers();
    boolean checkRole(RoleEnum role);
    Long getUserId();
    User getUser();

    void grant(Long id, RoleEnum roleEnum);
    void revoke(Long id, RoleEnum roleEnum);
}

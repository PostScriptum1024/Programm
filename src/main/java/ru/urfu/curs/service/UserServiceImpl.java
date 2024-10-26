package ru.urfu.curs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.urfu.curs.dto.UserDto;
import ru.urfu.curs.entity.Role;
import ru.urfu.curs.entity.User;
import ru.urfu.curs.repository.RoleRepository;
import ru.urfu.curs.repository.UserRepository;
import ru.urfu.curs.utility.RoleEnum;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;

        for (var role: List.of( RoleEnum.ADMIN, RoleEnum.USER, RoleEnum.READ_ONLY )) {
            if (roleRepository.findByName(role.getRoleName()).isEmpty()) {
                roleRepository.save(Role.builder().name(role.getRoleName()).build());
            }
        }
    }

    @Override
    public void SaveUser(UserDto user) {
        var userBuilder = User.builder()
                .id(user.getId())
                .name(user.getFirstName() + " " + user.getLastName())
                .email(user.getEmail())
                .password(user.getId() == null ? passwordEncoder.encode(user.getPassword()) : user.getPassword());
        if (user.getId() == null) {
            userBuilder.roles(List.of(roleRepository.findByName(RoleEnum.READ_ONLY.getRoleName()).get()));
        }
        userRepository.save(userBuilder.build());
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public boolean checkRole(RoleEnum role) {
        return getUser()
                .getRoles()
                .stream()
                .anyMatch(r -> Objects.equals(r.getName(), role.getRoleName()));
    }

    @Override
    public Long getUserId() {
        return getUser().getId();
    }

    @Override
    public User getUser() {
        return userRepository.findByEmail(SecurityContextHolder.getContext()
                .getAuthentication()
                .getName());
    }

    @Override
    public void grant(Long id, RoleEnum roleEnum) {
        userRepository.findById(id).ifPresent(user -> {
            var roles = user.getRoles();
            roleRepository.findByName(roleEnum.getRoleName()).ifPresent(role -> {
                roles.add(role);
                userRepository.save(user);
            });
        });
    }

    @Override
    public void revoke(Long id, RoleEnum roleEnum) {
        userRepository.findById(id).ifPresent(user -> {
            var roles = user.getRoles();
            roles.removeIf(r -> Objects.equals(r.getName(), roleEnum.getRoleName()));
            userRepository.save(user);
        });
    }
}

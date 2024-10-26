package ru.urfu.curs.utility;

import lombok.Getter;

@Getter
public enum RoleEnum {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER"),
    READ_ONLY("ROLE_READ_ONLY");

    private final String roleName;

    RoleEnum(String roleName) {
        this.roleName = roleName;
    }
}

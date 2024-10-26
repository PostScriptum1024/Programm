package ru.urfu.curs.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserItemDto {
    private Long id;
    private String name;
    private String email;
    private Boolean isAdmin;
    private Boolean isUser;
    private Boolean isReadOnly;
}

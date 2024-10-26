package ru.urfu.curs.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserTableDto {
    private Long currentId;
    private List<UserItemDto> users;
}

package ru.urfu.curs.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ShopListItemDto {
    private Long id;
    private Date date;
    private String email;
}

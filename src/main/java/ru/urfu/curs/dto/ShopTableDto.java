package ru.urfu.curs.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShopTableDto {
    private Boolean isReadOnly;
    private List<ShopItemDto> shops;
}

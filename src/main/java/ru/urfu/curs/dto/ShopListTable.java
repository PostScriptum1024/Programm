package ru.urfu.curs.dto;

import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShopListTable {
    private Boolean isReadOnly;
    private List<ShopListItemDto> lists;
}

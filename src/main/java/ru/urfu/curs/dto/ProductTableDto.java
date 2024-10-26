package ru.urfu.curs.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductTableDto {
    private Boolean isReadOnly;
    private List<ProductItemDto> products;
}

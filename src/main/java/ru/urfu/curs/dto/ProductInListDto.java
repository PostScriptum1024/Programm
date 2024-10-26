package ru.urfu.curs.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ProductInListDto extends ProductDto {
    private Long id;
    private Double cost;
    private String shop;
}

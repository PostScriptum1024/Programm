package ru.urfu.curs.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ShopListDto extends ShopListItemDto {
    private List<ProductInListDto> products;
    private Boolean isReadOnly;
    public Double getSumCost() {
        return products.stream().mapToDouble(ProductInListDto::getCost).sum();
    }
}

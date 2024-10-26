package ru.urfu.curs.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ProductItemDto extends ProductDto {
    public Double minCost;
    public Double maxCost;
    public List<ProductInShopDto> productInShops;
}

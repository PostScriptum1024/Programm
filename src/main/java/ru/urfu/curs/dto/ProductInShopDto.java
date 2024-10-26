package ru.urfu.curs.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductInShopDto {
    private Long id;
    private Long productId;
    private String productName;
    private String shopName;

    @NotEmpty
    protected Double cost;
    @NotEmpty
    protected Long shopId;
}

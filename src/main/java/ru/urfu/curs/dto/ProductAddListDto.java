package ru.urfu.curs.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductAddListDto {
    private Long id;
    private String productName;
    private Double cost;
    private String shopName;
}

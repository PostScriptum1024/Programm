package ru.urfu.curs.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShopItemDto {
    public Long id;

    @NotEmpty
    public String name;
}

package com.example.Product.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private String title;
    private int price;
    private String description;
    private String image;
    private String category;
}

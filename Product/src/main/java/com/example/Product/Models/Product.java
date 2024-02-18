package com.example.Product.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel {
    private int price;
    private String Dis;
    private Category category;
    private String name;
    private String image;

}

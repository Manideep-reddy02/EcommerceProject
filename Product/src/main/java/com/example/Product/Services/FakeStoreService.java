package com.example.Product.Services;

import com.example.Product.Models.Product;
import com.example.Product.dtos.ProductResponseDto;
import org.springframework.web.client.RestTemplate;

public class FakeStoreService implements IProductService{
    @Override
    public Product getSingleProduct(Long id) {
        //I should pass this id to fake store and get the details of this product
        //"https://fakestoreapi.com/products/1"
        //use REST template
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("https://fakestoreapi.com/products/"+id, ProductResponseDto.class);
        return null;
    }
}

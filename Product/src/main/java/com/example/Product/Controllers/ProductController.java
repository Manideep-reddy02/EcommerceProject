package com.example.Product.Controllers;

import com.example.Product.Models.Product;
import com.example.Product.dtos.ProductRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    //get all the products
    @GetMapping("/products")
    public List<Product>getAllProducts(){
        return new ArrayList<>();
    }

    //get a single product
    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id")Long id){
        return new Product();

    }
    @PostMapping("/product")
    public Product addNewProduct(@RequestBody ProductRequestDto productRequestDto){
        return new Product();
    }
    @PutMapping("/products{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody ProductRequestDto productRequestDto){
        return new Product();

    }
    @DeleteMapping("/products{id}")
    public boolean deleteProduct(@PathVariable("id") Long id){
        return true;

    }
}

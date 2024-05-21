package com.java.pocketmon.domain.laboratory.model;

import com.java.pocketmon.domain.laboratory.dto.response.ProductsDto;
import java.util.List;

public class Laboratory {
    private List<Product> products;

    public Laboratory(List<Product> products){
        this.products = products;
    }

    public List<ProductsDto> getProducts(){
        return products.stream().map(product -> new ProductsDto(product.getName(),
            product.getPrice())).toList();
    }

}

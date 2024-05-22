package com.java.pocketmon.domain.laboratory.model;

import com.java.pocketmon.domain.laboratory.dto.response.ProductsDto;
import java.util.List;

public class Laboratory {
    private List<Product> products;

    public Laboratory(){
        this.products = List.of(new Product("간식", 100, "간식을 먹으면 춤이 저절로 나와요"), new Product("포켓몬 볼", 200, "언젠가 숲 속에 들어가면 포켓몬을 만날지도 몰라요"));
    }

    public ProductsDto getProductInfo(int num){
        return new ProductsDto(products.get(num-1).getName(), products.get(num-1).getPrice());
    }

    public List<ProductsDto> getProducts(){
        return products.stream().map(product -> new ProductsDto(product.getName(),
            product.getPrice())).toList();
    }

}

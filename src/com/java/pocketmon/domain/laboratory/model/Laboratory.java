package com.java.pocketmon.domain.laboratory.model;

import com.java.pocketmon.domain.laboratory.dto.ResponseProductsDto;
import java.util.List;

public class Laboratory {
    private List<Product> products;

    public Laboratory(List<Product> products){
        this.products = products;
    }

    public List<ResponseProductsDto> getProducts(){
        return products.stream().map(product -> new ResponseProductsDto(product.getName(),
            product.getPrice())).toList();
    }

}

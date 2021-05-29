package com.mysale.api.model.dto;

import com.mysale.api.model.Seller;
import lombok.Data;

import java.io.Serializable;

@Data
public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = -8675076597078454461L;

    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum){
        this.sellerName  = seller.getName();
        this.sum = sum;
    }
}

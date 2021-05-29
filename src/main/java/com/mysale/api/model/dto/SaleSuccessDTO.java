package com.mysale.api.model.dto;

import com.mysale.api.model.Seller;
import lombok.Data;

@Data
public class SaleSuccessDTO {
    private static final long serialVersionUID = -8675076597078454461L;

    private String sellerName;
    private Long visited;
    private Long deals;


    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}

package com.mysale.api.model.dto;

import com.mysale.api.model.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO implements Serializable {

    private static final long serialVersionUID = 8950682947219809955L;
    private Long id;

    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private Seller seller;
}

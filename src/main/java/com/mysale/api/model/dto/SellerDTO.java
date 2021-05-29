package com.mysale.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerDTO implements Serializable {
    private static final long serialVersionUID = -8558489251915624930L;
    private Long id;
    private String name;
}

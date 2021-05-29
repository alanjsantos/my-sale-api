package com.mysale.api.controller;

import com.mysale.api.model.dto.SaleDTO;
import com.mysale.api.service.SaleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAllPage(Pageable pageable){
        Page<SaleDTO> page = saleService.findAllPage(pageable)
                .map(entity -> modelMapper.map(entity, SaleDTO.class));

        return ResponseEntity.ok(page);
    }
}

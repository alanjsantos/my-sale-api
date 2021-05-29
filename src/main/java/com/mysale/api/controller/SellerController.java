package com.mysale.api.controller;

import com.mysale.api.model.dto.SellerDTO;
import com.mysale.api.service.SellerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/sellers")
@RestController
public class SellerController {
    @Autowired
    private SellerService service;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        List<SellerDTO> list = service.findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, SellerDTO.class))
                .collect(Collectors.toList());

        return ResponseEntity.ok(list);
    }
}

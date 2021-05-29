package com.mysale.api.service;

import com.mysale.api.model.Sale;
import com.mysale.api.rpeository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public Page<Sale> findAllPage(Pageable pageable){
        Page<Sale> page = saleRepository.findAll(pageable);
        return page;
    }
}

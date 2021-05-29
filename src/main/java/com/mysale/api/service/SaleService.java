package com.mysale.api.service;

import com.mysale.api.model.Sale;
import com.mysale.api.model.dto.SaleSuccessDTO;
import com.mysale.api.model.dto.SaleSumDTO;
import com.mysale.api.rpeository.SaleRepository;
import com.mysale.api.rpeository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<Sale> findAllPage(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> page = saleRepository.findAll(pageable);
        return page;
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return saleRepository.successGroupedBySeller();
    }
}

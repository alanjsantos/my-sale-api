package com.mysale.api.service;

import com.mysale.api.model.Seller;
import com.mysale.api.rpeository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> findAll(){
        return sellerRepository.findAll();
    }

    public Seller findId(Long id) {
        Optional<Seller> seller = sellerRepository.findById(id);

        return seller.orElseThrow(() -> new IllegalArgumentException("ID não encontrado"));
    }
}

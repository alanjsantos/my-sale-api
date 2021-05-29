package com.mysale.api.rpeository;

import com.mysale.api.model.Sale;
import com.mysale.api.model.dto.SaleSuccessDTO;
import com.mysale.api.model.dto.SaleSumDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.mysale.api.model.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
            + " FROM tb_sales AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.mysale.api.model.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
            + " FROM tb_sales AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();


}

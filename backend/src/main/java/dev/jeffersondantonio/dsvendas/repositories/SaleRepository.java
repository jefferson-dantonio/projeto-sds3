package dev.jeffersondantonio.dsvendas.repositories;

import dev.jeffersondantonio.dsvendas.dto.SaleSuccessDTO;
import dev.jeffersondantonio.dsvendas.dto.SaleSumDTO;
import dev.jeffersondantonio.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new dev.jeffersondantonio.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
            + " FROM Sale As obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new dev.jeffersondantonio.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
            + " FROM Sale As obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();

}

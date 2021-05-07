package dev.jeffersondantonio.dsvendas.repositories;

import dev.jeffersondantonio.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}

package com.malves.mvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malves.mvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

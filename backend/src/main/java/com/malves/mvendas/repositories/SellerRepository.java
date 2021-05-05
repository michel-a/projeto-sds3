package com.malves.mvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malves.mvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}

package com.example.StockMarket.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.StockMarket.Entity.Company;


@Repository
public interface Companyrepository extends JpaRepository<Company, Long> {
	Company findByName(String Name);
}

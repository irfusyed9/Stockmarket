package com.example.StockMarket.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StockMarket.Entity.IPODetail;

@Repository
public interface IPOrepository extends JpaRepository<IPODetail, Long> {

	
}

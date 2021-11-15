package com.example.StockMarket.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StockMarket.Entity.IPODetail;
import com.example.StockMarket.Repository.IPOrepository;

@Service
public class IPOService {

	@Autowired
	private IPOrepository iporepo;

	public List<IPODetail> getAllIPO() {
		List<IPODetail> ipos = iporepo.findAll();
		return ipos;
	}
}

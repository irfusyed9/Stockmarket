package com.example.StockMarket.Service;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StockMarket.Entity.Company;
import com.example.StockMarket.Entity.Companystockexchangemap;
import com.example.StockMarket.Entity.StockExchange;
import com.example.StockMarket.Repository.StockExchangeRepository;

@Service
public class StockExchangeService {

	@Autowired
	private StockExchangeRepository stkexchgrepo;

	public List<StockExchange> getStockExchanges() {
		return stkexchgrepo.findAll();
	}

	public StockExchange addStockExchange(StockExchange stockexchange) {
		stkexchgrepo.save(stockexchange);
		return stockexchange;
	}

	public List<Company> getAllCompanies(long id) {
		List<Companystockexchangemap> compstockmap = stkexchgrepo.findById(id).get().getCompstockmap();
		List<Company> companies = new ArrayList<Company>();
		for (Companystockexchangemap cmps : compstockmap) {
			System.out.println("ghgh" + cmps.toString());
			companies.add(cmps.getCompany());
		}

		return companies;
	}

}

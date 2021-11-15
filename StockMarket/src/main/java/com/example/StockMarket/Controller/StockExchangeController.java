package com.example.StockMarket.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StockMarket.Entity.Company;
import com.example.StockMarket.Entity.Companystockexchangemap;
import com.example.StockMarket.Entity.StockExchange;
import com.example.StockMarket.Repository.StockExchangeRepository;
import com.example.StockMarket.Service.CompanyService;
import com.example.StockMarket.Service.StockExchangeService;

@RestController
@CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
@RequestMapping("/stockexchanges")
public class StockExchangeController {
	@Autowired
	private StockExchangeService stockexchangeservice;
	
	@Autowired
	private StockExchangeRepository stockExchangeRepository;

	@GetMapping(path = "")
	public ResponseEntity<List<StockExchange>> getStockExchanges() {
		return ResponseEntity.ok(stockexchangeservice.getStockExchanges());
	}

	@PostMapping(path = "")
	public ResponseEntity<?> addStockExchange(@RequestBody StockExchange stockexchange) {
		return ResponseEntity.ok(stockexchangeservice.addStockExchange(stockexchange));
	}

	@GetMapping(path = "/{id}/companies")
	public ResponseEntity<List<Company>> getAllCompanies(@PathVariable long id) {
		return ResponseEntity.ok(stockexchangeservice.getAllCompanies(id));
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteCompany(@PathVariable long id) {
		stockExchangeRepository.deleteById(id);
		
	}


}

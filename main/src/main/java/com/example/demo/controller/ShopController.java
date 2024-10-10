package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.shop;
import com.example.demo.repository.shoprepository;

@RestController
public class ShopController {
	
	@Autowired
	shoprepository repo;
	
	//get all the shop_details
	
	//url
	@GetMapping("/shop_details")
	public List<shop> getAllDetails(){
		List<shop> shop_details = repo.findAll();
		
		return shop_details;
	}
	
	@GetMapping("/shop_details/{id}")
	public shop getspot(@PathVariable int id) {
		shop sp = repo.findById(id).get();
		return sp;
	}
	
	@PostMapping("/shop_details/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createshopdetails(@RequestBody shop shop) {
		repo.save(shop);
	}
	
	
	@PutMapping("/shop_details/update/{id}")
	public shop updateshopdetails(@PathVariable int id) {
		shop shop = repo.findById(id).get();
		shop.setShopnm("Mayur");
		shop.setShopEID(101);
		
		repo.save(shop);
		
		return shop;
	}
	
	
	@DeleteMapping("/shop_details/delete/{id}")
	public void removeshopdetails(@PathVariable int id) {
		shop shop = repo.findById(id).get();
		repo.delete(shop);
	}
	
	
	
	
	
}

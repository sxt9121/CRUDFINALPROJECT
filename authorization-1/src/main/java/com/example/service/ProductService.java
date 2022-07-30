package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
	public Product saveProduct(Product Product) {
		 return repository.save(Product);
	}
	public List<Product>saveProducts(List<Product> products) {
		 return repository.saveAll(products);
		 
		
	}
	
	public List <Product> getProducts(){
		return repository.findAll();
	}
	public Product getProductById(int id){
		 return repository.findById(id).orElse(null);
	}
	public Product getProductByName(String name){
		 return repository.findByName(name);
	}
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "product is removed" +id;
		
	}
	//public List<Product> getProducts() {
		// TODO Auto-generated method stub
		//return null;
	//}
	
	
	
	

}

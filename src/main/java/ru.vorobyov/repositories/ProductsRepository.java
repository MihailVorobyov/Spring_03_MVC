package ru.vorobyov.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.vorobyov.entites.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsRepository {
	
	private static int id = 1;
	
	private List<Product> productList;
	
	@Autowired
	public void setProductList() {
		productList = new ArrayList<>();
		
		Product product1 = new Product();
		product1.setId(id++);
		product1.setTitle("Яблоки");
		product1.setCost(50.0);
		
		Product product2 = new Product();
		product1.setId(id++);
		product1.setTitle("Груши");
		product1.setCost(70.0);
		
		Product product3 = new Product();
		product1.setId(id++);
		product1.setTitle("Бананы");
		product1.setCost(45.0);
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
	}
	
	public List<Product> getProductList() {
		return productList;
	}
	
	public Product getProductById (int id) {
		for (Product p : productList) {
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}
}

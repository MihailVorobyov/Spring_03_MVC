package ru.vorobyov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vorobyov.service.ProductsService;

@Controller
@RequestMapping("/shop")
public class ProductsController {
	
	private ProductsService productsService;
	
	@Autowired
	public void setProductsService(ProductsService productsService) {
		this.productsService = productsService;
	}
	
	@RequestMapping("/showProducts")
	public String showAllProducts(Model uiModel) {
		uiModel.addAttribute("products", productsService.getProductList());
		return "products";
	}
}

package ru.vorobyov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vorobyov.entites.Product;
import ru.vorobyov.repositories.ProductsRepository;

import java.util.List;

@Service
public class ProductsService {
    
    private ProductsRepository productsRepository;

    @Autowired
    public void productsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Product getProductById(int id) {
        return productsRepository.getProductById(id);
    }
    
//    public Product[] getProductList() {
//        List<Product> list = productsRepository.getProductList();
//        Product[] p = new Product[list.size()];
//
//        list.toArray(p);
//
//        return p;
//    }
    
    public List<Product> getProductList() {
        return productsRepository.getProductList();
    }

    public ProductsService() {

    }
}

package com.example.dream_shops.service.product;

import com.example.dream_shops.model.Product;
import com.example.dream_shops.request.AddProductRequest;
import com.example.dream_shops.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getAllProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductByName(String name, String category);
    List<Product> getProductsByBrandAndName(String name, String brand);
    Long countProductsByBrandAndName(String brand, String name);
}

package com.mama1emon.simpleinventorymanagmentapi.repositories;

import com.mama1emon.simpleinventorymanagmentapi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductsByName(String name);
    List<Product> findProductsByBrand(String brand);
    List<Product> findProductsByNameAndBrand(String name, String brand);
    List<Product> findProductByQuantityLessThan(Long quantity);
}

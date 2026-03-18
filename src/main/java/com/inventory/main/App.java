package com.inventory.main;

import com.inventory.dao.ProductDAO;
import com.inventory.entity.Product;

public class App {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();

        Product p1 = new Product("Laptop", 75000.0, 10, "Electronics");
        Product p2 = new Product("Mouse", 1200.0, 50, "Electronics");

        dao.saveProduct(p1);
        dao.saveProduct(p2);

        dao.updateProduct(1L, 72000.0, 8);
        dao.deleteProduct(2L);

        System.out.println("Skill-2 CRUD operations completed.");
    }
}
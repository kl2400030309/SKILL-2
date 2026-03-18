package com.inventory.loader;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.inventory.entity.Product;

public class ProductDataLoader {

    public static void loadSampleProducts(Session session) {
        Transaction tx = session.beginTransaction();

        session.persist(new Product("Laptop", 899.99, 15, "Electronics"));
        session.persist(new Product("Mouse", 25.50, 50, "Electronics"));
        session.persist(new Product("Keyboard", 45.00, 30, "Electronics"));
        session.persist(new Product("Monitor", 299.99, 20, "Electronics"));
        session.persist(new Product("Desk Chair", 150.00, 0, "Furniture"));
        session.persist(new Product("Desk Lamp", 35.75, 25, "Furniture"));
        session.persist(new Product("Notebook", 5.99, 100, "Stationery"));
        session.persist(new Product("Pen Set", 12.50, 75, "Stationery"));

        tx.commit();
        System.out.println("Sample products added successfully!");
    }
}
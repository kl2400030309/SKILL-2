package com.inventory.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.inventory.entity.Product;
import com.inventory.util.HibernateUtil;

public class ProductDAO {

    public void saveProduct(Product product) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(product);
        tx.commit();
        session.close();
    }

    public Product getProduct(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Product product = session.get(Product.class, id);
        session.close();
        return product;
    }

    public void updateProduct(Long id, Double price, Integer quantity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product product = session.get(Product.class, id);
        if (product != null) {
            product.setPrice(price);
            product.setQuantity(quantity);
        }

        tx.commit();
        session.close();
    }

    public void deleteProduct(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product product = session.get(Product.class, id);
        if (product != null) {
            session.remove(product);
        }

        tx.commit();
        session.close();
    }
}
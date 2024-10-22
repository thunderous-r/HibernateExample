package org.example;

import org.example.config.SessionFactoryConfig;
import org.example.entity.mapped.Product;
import org.hibernate.SessionFactory;

public class MappedRunner {
    public static void main(String[] args) {
        SessionFactoryConfig sessionFactoryConfig = new SessionFactoryConfig();
        SessionFactory sessionFactory = sessionFactoryConfig.getSessionFactory();

        sessionFactory.inTransaction(session -> {
            Product product = new Product();
            product.setName("Apple");
            product.setPrice(100);
            session.save(product);
        });
    }
}

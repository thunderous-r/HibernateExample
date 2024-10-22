package org.example;

import org.example.config.SessionFactoryConfig;
import org.example.entity.Car;
import org.example.entity.Human;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Human ivan = Human.builder()
//                .name("Ivan")
//                .age(25)
//                .build();
//        Car bmw = Car.builder()
//                .name("BMW")
//                .year(2022)
//                .human(ivan)
//                .build();

        SessionFactoryConfig sessionFactoryConfig = new SessionFactoryConfig();
        SessionFactory sessionFactory = sessionFactoryConfig.getSessionFactory();


//        sessionFactory.inTransaction(session -> {
//            session.save(ivan);
//            session.save(bmw);
//        });

        sessionFactory.inTransaction(session -> {
            Human human = session.get(Human.class, 1);
            System.out.println(human);
        });
    }
}
package org.example;

import org.example.config.SessionFactoryConfig;
import org.example.entity.single.SingleTableCar;
import org.example.entity.single.Motorbike;
import org.example.entity.single.Truck;
import org.example.entity.single.Vehicle;
import org.hibernate.SessionFactory;

public class SingleRunner {

    public static void main(String[] args) {

        SessionFactoryConfig sessionFactoryConfig = new SessionFactoryConfig();
        SessionFactory sessionFactory = sessionFactoryConfig.getSessionFactory();

        sessionFactory.inTransaction(session -> {
            Vehicle vehicle = new Vehicle();
            vehicle.setProductionYear(2020);
            vehicle.setName("Tricycle");
            session.save(vehicle);

            SingleTableCar car = new SingleTableCar();
            car.setProductionYear(2021);
            car.setName("BMW");
            car.setSeatsAmount(5);
            session.save(car);

            Truck truck = new Truck();
            truck.setProductionYear(2022);
            truck.setName("Ford");
            truck.setMaxLoad(10000);
            session.save(truck);

            Motorbike motorbike = new Motorbike();
            motorbike.setProductionYear(2023);
            motorbike.setNumberOfWheels(2);
            motorbike.setName("Honda");
            session.save(motorbike);
        });
    }
}

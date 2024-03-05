package org.example.controller;

import org.example.model.Car;
import org.example.model.ElectricCar;
import org.example.service.Drivable;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Drivable drivable = new Car();
//        Drivable drivee = new ElectricCar();

        Car car = new Car("Suzuki","Maruthi","FZ");
        Car car1 = new Car("Maaza","Slice",2002,"7UP");
        Car car2 = new Car("Maaza","Slice",2002,"7UP");
    }
}
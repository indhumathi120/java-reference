package org.example.service;

import org.example.model.Car;
import org.example.model.ElectricCar;

public interface Drivable {

     Car drive(Integer miles);

     Car drive(String Destination);
     Car drive();
}

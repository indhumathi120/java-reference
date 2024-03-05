package org.example.model;

import org.example.model.Car;
import org.example.service.Drivable;

public class ElectricCar extends Car implements Drivable {

    private Integer capacity;
    private Integer battery;

    private Float chargingTime;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public Float getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(Float chargingTime) {
        this.chargingTime = chargingTime;
    }


    public ElectricCar(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public ElectricCar(String make, String model, Integer year, String color) {
        super(make, model, year, color);
    }

    void Mytest(){
        System.out.println("Hello am from child-class ElectricCar");
    }
}

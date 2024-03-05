package org.example.model;

import org.example.service.Drivable;

public class Car extends Vehicle implements Drivable{

    private Engine engine; // extends not posible as this is(has relatoinship) also already we have Vehicle
    public Car(String str, String str2, String str3){
        System.out.println("This is first constructor");
    }
    public Car(String make,String model,Integer year,String color){
        this.make = make;
        System.out.println("This is second constructor");
    }
    @Override
    public void start() {

    }
    @Override
    public void stop(){

    }

    private String make;
    private String model;
    private Integer year;
    private String color;
    private Integer mileage;
    public Integer totalCars;
     void Mytest(){
        System.out.println("Hello am from parent class-Car");
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    @Override
    public Car drive(Integer miles) {
        return null;
    }
    @Override
    public Car drive(String Destination){
        return null;
    }

    @Override
    public Car drive() {
        return null;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

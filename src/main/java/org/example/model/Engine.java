package org.example.model;

public class Engine {
 public String getFuelType() {
  return fuelType;
 }

 public void setFuelType(String fuelType) {
  this.fuelType = fuelType;
 }

 private Integer horsepower;
 private String fuelType;

 public Integer getHorsepower() {
  return horsepower;
 }

 public void setHorsepower(Integer horsepower) {
  this.horsepower = horsepower;
 }
}

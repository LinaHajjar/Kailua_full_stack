package com.example.kailua_full_stack.Model;

import java.time.LocalDate;

public class Car {
    String regNB;
    int car_Id;
    String brand;
    String model;
    LocalDate firstRegistrationDate;
    int odometer;
    String description_of_the_car;

    public Car(){}

    public Car(String regNB, int car_Id, String brand, String model, LocalDate firstRegistrationDate, int odometer, String description_of_the_car) {
        this.regNB = regNB;
        this.car_Id = car_Id;
        this.brand = brand;
        this.model = model;
        this.firstRegistrationDate = firstRegistrationDate;
        this.odometer = odometer;
        this.description_of_the_car = description_of_the_car;
    }

    public String getRegNB() {
        return regNB;
    }

    public void setRegNB(String regNB) {
        this.regNB = regNB;
    }

    public int getCar_Id() {
        return car_Id;
    }

    public void setCar_Id(int car_Id) {
        this.car_Id = car_Id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getFirstRegistrationDate() {
        return firstRegistrationDate;
    }

    public void setFirstRegistrationDate(LocalDate firstRegistrationDate) {
        this.firstRegistrationDate = firstRegistrationDate;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getDescription_of_the_car() {
        return description_of_the_car;
    }

    public void setDescription_of_the_car(String description_of_the_car) {
        this.description_of_the_car = description_of_the_car;
    }
}

package com.example.kailua_full_stack.Model;

public class Car_type {
    int car_Id;
    int ccm;
    enum gear {AUTOMATIC,MANUAL};
    boolean airCondition;
    boolean cruiseControl;
    int seatsNb;
    boolean seatsLeather;
    int horsePower;

    public Car_type(){}
    public Car_type(int car_Id, int ccm, boolean airCondition, boolean cruiseControl, int seatsNb, boolean seatsLeather, int horsePower) {
        this.car_Id = car_Id;
        this.ccm = ccm;
        this.airCondition = airCondition;
        this.cruiseControl = cruiseControl;
        this.seatsNb = seatsNb;
        this.seatsLeather = seatsLeather;
        this.horsePower = horsePower;
    }

    public int getCar_Id() {
        return car_Id;
    }

    public void setCar_Id(int car_Id) {
        this.car_Id = car_Id;
    }

    public int getCcm() {
        return ccm;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    public int getSeatsNb() {
        return seatsNb;
    }

    public void setSeatsNb(int seatsNb) {
        this.seatsNb = seatsNb;
    }

    public boolean isSeatsLeather() {
        return seatsLeather;
    }

    public void setSeatsLeather(boolean seatsLeather) {
        this.seatsLeather = seatsLeather;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}

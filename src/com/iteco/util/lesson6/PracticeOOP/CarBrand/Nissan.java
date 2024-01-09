package com.iteco.util.lesson6.PracticeOOP.CarBrand;

import com.iteco.util.lesson6.PracticeOOP.Cars;

public class Nissan extends Cars {
    private int fuel;
    private String engine;
    public String getEngine() {
        return this.engine;
    }
    public void setEngine(String enginesType) {
        this.engine = enginesType;
    }
    public int getFuel() {
        return this.fuel;
    }
    public void setFuel(int fuelSize) {
        this.fuel = fuelSize;
    }
    public Nissan(int fuel, String engine, String model, String equipment) {
        super(model, equipment);
        this.fuel = fuel;
        this.engine = engine;
    }
    public Nissan() {
        this.fuel = 60;
        this.engine = "TD27";
    }

    @Override
    public void printCharacteristics() {
        System.out.println("Nissan Datsun 1996 года выпуска, объём бака " + this.fuel + " , марка двигателя " + this.engine +
                " , комплектация " + getEquipment());
    }
}

package com.iteco.util.lesson6.PracticeOOP.CarBrand;

import com.iteco.util.lesson6.PracticeOOP.Cars;

public class Toyota extends Cars {
    private int batteryCapacity;
    private String charger;
    public String getCharger() {
        return this.charger;
    }
    public void setCharger(String chargerType) {
        this.charger = chargerType;
    }
    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }
    public void setBatteryCapacity(int capacity) {
        this.batteryCapacity = capacity;
    }
    public Toyota(int batteryCapacity, String charger, String model, String equipment) {
        super(model, equipment);
        this.batteryCapacity = batteryCapacity;
        this.charger = charger;
    }
    public Toyota() {
        this.batteryCapacity = 71400;
        this.charger = "Charging station";
    }

    @Override
    public void printCharacteristics() {
        System.out.println("Toyota bZ4X 2022 года выпуска, мощность аккумулятора " + this.batteryCapacity +
                " , заряд аккумулятора происходит от " + this.charger + " , комплектация " + getEquipment());
    }
}

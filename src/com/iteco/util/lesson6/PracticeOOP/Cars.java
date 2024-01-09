package com.iteco.util.lesson6.PracticeOOP;

public abstract class Cars {
    private String model;
    private String equipment;
    public String getEquipment() {
        return this.equipment;
    }
    public void setEquipment(String equipmentCar) {
        this.equipment = equipmentCar;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String modelCar) {
        this.model = modelCar;
    }
    public Cars(String model, String equipment) {
        this.model = model;
        this.equipment = equipment;
    }
    public Cars() {
        this.model = "model";
        this.equipment = "equipment";
    }
    public abstract void printCharacteristics();
}

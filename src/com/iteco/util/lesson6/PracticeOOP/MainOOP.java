package com.iteco.util.lesson6.PracticeOOP;

import com.iteco.util.lesson6.PracticeOOP.CarBrand.Nissan;
import com.iteco.util.lesson6.PracticeOOP.CarBrand.Toyota;

public class MainOOP {
    public static void main(String[] args) {
        Nissan Datsun = new Nissan(60, "TD27", "Datsun", "Basic");
        Toyota bZ4X = new Toyota(71400, "Charging station", "bZ4X", "Premium");
        Datsun.printCharacteristics();
        bZ4X.printCharacteristics();
    }
}

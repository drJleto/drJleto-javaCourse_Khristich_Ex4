package com.iteco.util.lesson3;

import java.util.HashMap;
import java.util.Scanner;
/*
    На вход подаётся строка с именем и числом. Необходимо написать метод, который будет
    складывать все числа, и приветствовать пользователя. Число как минимум должно иметь
    2 разряда и максимум 5. Сумму цифр необходимо реализовать при помощи рекурсии. Необходимо
    в программе реализовать конвертер чисел в названия, и выводить сумму цифр названием.
    (сумма цифр не должна превышать 10 - для простоты реализации конвертора)
 */

public class PracticeMethods {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Привет!!! Введи своё имя и четыре числа от 1 до 10: ");
        String inputLine = scr.nextLine();
        lineSplit(inputLine);
    }

    private static void lineSplit(String name) {
        HashMap<Integer, String> converter = new HashMap<Integer, String>();
        converter.put(1, "один");
        converter.put(2, "два");
        converter.put(3, "три");
        converter.put(4, "четыре");
        converter.put(5, "пять");
        converter.put(6, "шесть");
        converter.put(7, "семь");
        converter.put(8, "восемь");
        converter.put(9, "девять");
        converter.put(10, "десять");

        String[] words = name.split(" ");
        String word = words[0];
        int number = Integer.parseInt(words[1]);
        System.out.println("Здравствуй, " + word + "! " + "Сумма цифр в числе = " + converter.get(recursiveSum(number)));
    }

    private static int recursiveSum(int i) {
        if(i == 0) {
            return 0;
        }else
            return(i % 10 + recursiveSum(i / 10));
    }
}

package com.iteco.util.lesson1;

import java.util.Scanner;

// UpperCamelCase - UserEntity
public class Main {
    /**
     * Тут можно указать, что делает блок кода
     * @author Vladimir
     * @param args
     */
    // LowerCamelCase - mainMethod  | f(x)
    public static void main(String[] args) {
        System.out.println("Hello there. General Kenobi!!!");
        int age = 26;
        System.out.println(age);
        System.out.println("JAVA");
        System.out.println(args[0] + " | " + args[1]);

        boolean flag = true; // true | false
        byte byteVar = 98;
        short shortVar = 9999;
        int intVar = 123487;
        long longVar = 1238940189249L;

        float floatVar = (float) 1238498.12387498;
        double doubleVar = 1293809834.1237478;

        char charVar = (char) byteVar;
        System.out.println(charVar);
        String name = "Alice";
        float percent = 14.2894F;
        System.out.println(name);
        System.out.print("Vladimir - " + age);
        System.out.println("there");
        // %s - строка, %d - целочилсенные типы данных, %f - вещественные типы
        //%.2f - нужно для окруления (2 - два знака после запятой)
        // Спец символы
        // \t таблуяция
        // \b символ возврата в тексте на один шаг назад или удаление одного символа в строке
        // \n символ перехода на новую строку
        // \r символ возврата каретки
        // \" символ двойной кавычки
        // \\ символ обратной косой черты (\)
        System.out.printf("%s - %d | %.2f", name, age, percent);
        int firstVar = 101;
        int secondVar = 0b1000101;
        int octalVar = 0746;
        int var_16 = 0x4d;

        final  int INDEX = 121_212;
        int age2 = age++;
        int age3 = age + (-age);
        int num = age - 10;
        int num2 = 23 * 3;
        int num3 = 14 / 3;
        int num4 = 104 % 10;

        int age4 = (18 + 2) * 3;

        int age5 = 18;
        age5 += 10; // age5 = age5 + 10

        String accept = age4 > 18 ? "YES" : "NO";
        //System.out.println(age4 > 18 ? "YES" : "NO");
        System.out.println(num3);
        System.out.println(num4);

        // (инкримент)++var | var++ | --var | var-- (декримент)

        System.out.println(secondVar);
        System.out.println(octalVar);
        System.out.println((char) var_16);
        System.out.println(INDEX);
        System.out.println(++age);
        System.out.println(age++);
        System.out.println(age);
        System.out.println(age2);

        //Считывание данных введенных с клавиатуры Scanner

        Scanner scr = new Scanner(System.in);
        String newName = scr.next();
        int newAge = scr.nextInt();
        System.out.println(newName + "\n" + newAge);
        scr.close();

    }
}
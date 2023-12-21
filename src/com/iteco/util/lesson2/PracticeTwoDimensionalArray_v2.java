package com.iteco.util.lesson2;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Stream;

public class PracticeTwoDimensionalArray_v2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите три элемента певрой строки массива через пробел: ");
        String[] firstLine = scr.nextLine().split(" ");
        Integer[] firsLineInt = Stream.of(firstLine).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        System.out.println("Введите три элемента второй строки массива через пробел: ");
        String[] secondLine = scr.nextLine().split(" ");
        Integer[] secondLineInt = Stream.of(secondLine).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        System.out.println("Введите три элемента третьей строки массива через пробел: ");
        String[] thirdLine = scr.nextLine().split(" ");
        Integer[] thirdLineInt = Stream.of(thirdLine).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        System.out.println("Введите три элемента четвертой строки массива через пробел: ");
        String[] fourthLine = scr.nextLine().split(" ");
        Integer[] fourthLineInt = Stream.of(fourthLine).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        Integer[][] twoDimensionalArray = new Integer[][]{firsLineInt, secondLineInt, thirdLineInt, fourthLineInt};
        sumOfLine(twoDimensionalArray);
        sumOfColumn(twoDimensionalArray);
        avg(twoDimensionalArray);
        flattenFlip(twoDimensionalArray);
    }
    //Вывод номера строки и суммы её элементов
    private static void sumOfLine(Integer[][] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Строка: " + i + " Сумма: " + Arrays.stream(array[i]).mapToInt(x -> x).sum());
        }
    }
    //Вывод номера столбца и суммы его элементов
    private static void sumOfColumn(Integer[][] array) {
        for(int i = 0; i < array.length; i++) {
            int sumCol = 0;
            for(int j = 0; j < 3; j++) {
                sumCol += array[j][i];
            }
            System.out.println("Столбец: " + i + ": " + sumCol);
        }
    }
    //Замена всех нечётных элементов массива на единицу,а все чётные элементы на нуль.
    //Результат выводится на экран
    private static void intConvert(Integer[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < 3; j++) {
                if(array[i][j] % 2 != 0) {
                    array[i][j] = 1;
                }else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " \n");
            }
        }
    }
    //Нахождение среднего арефметического для каждой строки массива
    private static void avg(Integer[][] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Строка: " + i + " Среднее арефметичесое элементов строки: " + Arrays.stream(array[i]).mapToDouble(a -> a).average().getAsDouble());
        }
    }
    //Преобразование двумерного массива в одномерный и вывод его элементов в обратном порядке
    private static void flattenFlip(Integer[][] array) {
        ArrayList<Integer> flattenedArray = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j <array[i].length; j++) {
                flattenedArray.add(array[i][j]);
            }
        }
        Collections.reverse(flattenedArray);
        System.out.println(flattenedArray);
    }
}

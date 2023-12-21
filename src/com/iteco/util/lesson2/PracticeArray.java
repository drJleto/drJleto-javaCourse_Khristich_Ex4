package com.iteco.util.lesson2;
/*
Дан массив [3, 22, 1, 13, 4, 6, 16, 5], состоящий из целых чисел.

1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.

2.Напишите программу, которая выводит все двузначные числа массива.

3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.

4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.

5.***Напишите программу, которая переворачивает массив в обратном порядке.
 */
public class PracticeArray {
    public static void main(String[] args) {
        int array[] = {3, 22, 1, 13, 4, 6, 16, 5};
        int max = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i]%2 !=0){

            } else if (array[i]%2 == 0){
                System.out.print(array[i] + " ");
            }
        System.out.println("\n");
        for (int i = 0; i < array.length; i++)
            if (array[i] > 10) System.out.print(array[i] + " ");
        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                System.out.print(max);
            }
        }
        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.print(sum);
        System.out.println("\n");

        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}

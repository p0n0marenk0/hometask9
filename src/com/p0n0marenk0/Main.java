//1) Заполнить массив случайными числами. Подсчитать:
//- количество элементов которые больше своего соседа слева
//- количество четных элементов
//- количество элементов которые меньше среднего арифметического
//2) Попросить пользователя ввести строку и имя файла. Записать строку в файл.
//3*) Написать метод который ищет при помощи бинарного поиска есть ли число в
//отсортированном массиве
//4*) Подсчитать количество треугольников, у которых стороны заданы целыми числами,
// и площадь которых не больше 100.
//4.1*) Сделать задание так чтобы не было повторяющихся треугольников,
//например (3,4,5) и (5,3,4) - повторяющиеся.
package com.p0n0marenk0;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длинну массива: ");
        int arrayLength = scanner.nextInt();
        int[] array = arrayOfRandomNumbers(arrayLength);


        System.out.println("Заданный массив: " + Arrays.toString(array));
        System.out.println("Kоличество элементов которые больше своего соседа слева: " + showAmountLeftHigherElements(array));
        System.out.println("Количество четных элементов: " + showEvenNumbers(array));
        System.out.println("Kоличество элементов которые меньше среднего арифметического: " + showNumbersHigherThenAverage(array));

    }

    private static int showNumbersHigherThenAverage (int[] array) {
        int count = 0;
        double summary = 0.0;
        for (int j : array) {
            summary += j;
        }
        double average = summary/array.length;
        for (int j : array) {
            if (j < average) {
                count++;
            }
        }
            //System.out.println(summary);
            //System.out.println(average);

        return count;
    }

    private static int showEvenNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    private static int showAmountLeftHigherElements(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                count++;
            }
        }
        return count;
    }


    private static int[] arrayOfRandomNumbers(int arrayLength) {
        Random random = new Random();
        int[] arrayOfRandomNumbers = new int[arrayLength];
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = random.nextInt(100);
        }
        return arrayOfRandomNumbers;
    }
}

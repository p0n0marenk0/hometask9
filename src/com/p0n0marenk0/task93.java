//task3
//Написать метод который ищет при помощи бинарного поиска есть ли число в
//отсортированном массиве
package com.p0n0marenk0;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task93 {

    public static void main(String[] args) {
        System.out.println("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("Введите искомое значение: ");
        int valueForFind = scanner.nextInt();
     //    int[] array;
    //    array = arrayOfRandomNumbers(length);
        //System.out.println(Arrays.binarySearch(array, valueForFind));
    //}
        int index = binarySearch(arrayOfRandomNumbers((length)), valueForFind, 0, length - 1);
        if (index == -1) {
            System.out.println("Нихуя похожего нету в этом ебанном массиве");
        } else {
            System.out.println("Индекс искомого элемента: " + index);
        }
    }

    private static int[] arrayOfRandomNumbers(int arrayLength) {
        Random random = new Random();
        int[] arrayOfRandomNumbers = new int[arrayLength];
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = random.nextInt(100);
        }
        Arrays.sort(arrayOfRandomNumbers);
        System.out.println(Arrays.toString(arrayOfRandomNumbers));
        return arrayOfRandomNumbers;
    }


        public static int binarySearch(int[] sortedArray, int searchValue, int lowElement, int highElement) {
        int myValue = -1;

        while (lowElement <= highElement) {
            int middleOfRange = (lowElement + highElement) / 2;
            if (sortedArray[middleOfRange] < searchValue) {
                lowElement = middleOfRange + 1;
            } else if (sortedArray[middleOfRange] > searchValue) {
                highElement = middleOfRange - 1;
            } else if (sortedArray[middleOfRange] == searchValue) {
                myValue = middleOfRange;
                break;
            }
        }
        return myValue;
    }
}

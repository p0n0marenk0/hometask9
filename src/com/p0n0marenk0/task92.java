//task2
//Попросить пользователя ввести строку и имя файла. Записать строку в файл.
package com.p0n0marenk0;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task92 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String stringOfUser = scanner.nextLine();
        System.out.println("Введите имя файла: ");
        String nameOfFile = scanner.nextLine();
        writeToFileV2(stringOfUser, nameOfFile);
    }

    private static void writeToFileV2(String str, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

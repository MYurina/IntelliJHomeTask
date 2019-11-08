package com.company;

import java.util.Scanner;

public class Exersice13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1, str2;
        System.out.println("Введите две строки");
        str1 = in.nextLine();
        str2 = in.nextLine();
        int lenght1 = str1.length();
        int lenght2 = str2.length();
            if (lenght1 < lenght2) {
            System.out.println("Вторая строка длинее" + str2);
        } else {
            System.out.println("Первая строка длинее" +str1);
        }

    }
}

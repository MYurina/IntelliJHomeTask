package com.company;

import java.util.Scanner;

public class Exersice6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, z;
        System.out.println("Введите три числа");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        System.out.println("Среднее арифметическое");
        int u = (x+y+z)/3;
        System.out.println(u);
        int i = u/2;
        if (i > 3) {
            System.out.println("Программа выполнена корректно");
        } else {
            System.out.println("Программа выполнена некорректно.Деление среднего арифметического на 2 меньше 3");
        }
    }

}


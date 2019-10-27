package com.company;

import java.util.Scanner;

public class Exersice9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int x[] = new int[size];
        System.out.println("Введите элементы массива");
        for(int i=0; i < x.length; i++){
                x[i] = in.nextInt()*2;
        }
        System.out.println("Вывод массива");
        for(int i=0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }
}

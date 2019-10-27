package com.company;

import java.util.Scanner;

public class Exersice10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер квадратной матрицы");
        int size = in.nextInt();
        int x[][] = new int[size][size];
        System.out.println("Введите элементы матрицы");
        for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                x[i][j] = in.nextInt();
            }
        }
        System.out.println("первая строка");
        for(int j = 0; j < size; j++){
            System.out.print(x[0][j]*3);
            System.out.print(" ");
        }
    }
}

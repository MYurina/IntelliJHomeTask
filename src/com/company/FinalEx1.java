package com.company;

import java.util.Scanner;

public class FinalEx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String binaryString = in.nextLine();
        int result = 0;
        int j = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--, j++) {
            if (binaryString.charAt(i) == '1') {
                result += (int) Math.pow(2, j);
            }
        }
        System.out.print("Число в десятичном формате равно: " + result + "\n");
    }
}

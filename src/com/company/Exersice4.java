package com.company;

import java.util.Scanner;

public class Exersice4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input binary number: ");
        String binaryString = in.nextLine();
        //перевод из двоичной системы в десятичную
        int binaryNumber = Integer.parseInt(binaryString, 2);
        System.out.println(binaryNumber);

}

}
package com.company;

import java.util.Scanner;

public class Exersice12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Введите строку");
        str = in.nextLine();
        //System.out.println(str);
        char[] chArray = str.toCharArray();
        String str1 = "";
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] != ' ') str1 += chArray[i];
        }
        System.out.println(str1);
    }
}


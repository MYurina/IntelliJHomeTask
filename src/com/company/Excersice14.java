package com.company;

        import java.util.Scanner;

public class Excersice14 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Введите число");
        s = in.nextLine();
        int x = Integer.parseInt(s);
        double y = x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);

    }
}
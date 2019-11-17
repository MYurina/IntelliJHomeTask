package com.company;
import java.util.Scanner;
import java.math.*;

public class FinalEx3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара");
        double kursDollar = in.nextDouble();
        System.out.println("Введите количество рублей");
        double rubbles = in.nextDouble();
        double result = rubbles / kursDollar;
        //BigDecimal res = new BigDecimal(result);
       // BigDecimal result1;
// Using setScale() method
       // result1 = res.setScale(2, RoundingMode.HALF_UP);
        result = Math.round(result*100)/100.0d;
        System.out.println("Итого :" + result + "\n");

    }
}

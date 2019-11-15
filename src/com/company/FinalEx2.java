package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class FinalEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int unsortedArray[] = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = in.nextInt();
        }
        insertIntoSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
    private static void insertIntoSort(int[] arrayToSort) {
        int temp, j;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            if (arrayToSort[i] > arrayToSort[i + 1]) {
                temp = arrayToSort[i + 1];
                arrayToSort[i + 1] = arrayToSort[i];
                j = i;
                while (j > 0 && temp < arrayToSort[j - 1]) {
                    arrayToSort[j] = arrayToSort[j - 1];
                    j--;
                }
                arrayToSort[j] = temp;
            }
        }
    }
}
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Excersice15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int unsortedArray[] = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = in.nextInt();
        }
        //System.out.println(Arrays.toString(unsortedArray));
        bubbleSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static void bubbleSort(int[] arrayToSort) {
        //Проход по массиву
        // Сравниваем два соседних элемента
        // Повтоорить, пока не отсортирует
        for (int index = 0; index < arrayToSort.length - 1; index++)
            if (arrayToSort[index] > arrayToSort[index + 1]) {
                int temp = arrayToSort[index];
                arrayToSort[index] = arrayToSort[index + 1];
                arrayToSort[index + 1] = temp;
                bubbleSort(arrayToSort);
            }
    }

}




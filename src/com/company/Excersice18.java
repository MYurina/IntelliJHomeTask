package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Excersice18 {
    public static void main(String[] args) {
        int countOfString = 0; //считаем количество строк
        try (FileReader fin = new FileReader("C://FilesforIDEAhometask//ex16.txt")) { // измени место расположения файла
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader bf = new BufferedReader(fin);
            String line = bf.readLine();
            while (line != null) {
                countOfString++;
                System.out.println(line);
                line = bf.readLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Количество строк в файле: " + countOfString);
//String str = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");//: окончание ввода - строка 'stop' ");
        try (FileWriter fos = new FileWriter("C://FilesforIDEAhometask//ex16.txt")) {
            for (int i = 0; i < countOfString; i++) {
                String s = in.nextLine();
                fos.write(s + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}







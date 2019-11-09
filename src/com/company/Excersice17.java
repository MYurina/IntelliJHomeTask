package com.company;
import java.io.*;
import java.util.Scanner;

public class Excersice17 {
    public static void main(String args[]) {
        String str = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст: окончание ввода - строка 'stop' ");
        try(FileWriter fos = new FileWriter("C://FilesforIDEAhometask//ex17.txt")) {
            while (!str.equals("stop")){
                System.out.print(": ");
                str = in.nextLine();
                {
                    fos.write(str +"\n");
                }
                if (str.compareTo("stop") == 0) break;
            }
        }catch(IOException exc) {
            System.out.println(exc.getMessage());
        }catch(Exception exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        System.out.println("Данные записаны в файл");
    }
}
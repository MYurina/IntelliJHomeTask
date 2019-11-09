package com.company;

import java.io.*;

public class Excersice16 {

    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("C://FilesforIDEAhometask//ex16.txt"))
        {
            System.out.printf("File size: %d bytes \n", fin.available());

            int i=-1;
            while((i=fin.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}



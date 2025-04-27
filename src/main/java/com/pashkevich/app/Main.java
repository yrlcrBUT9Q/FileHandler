package com.pashkevich.app;

import java.io.File;

public class Main {

    static File myFile = new File("C:\\Users\\Kirill\\Desktop\\study\\Hillel_Java_Basic\\FileHandler\\files\\file.txt");

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        fileHandler.writeFile("test", myFile);
        System.out.println(fileHandler.readFile(myFile));
    }

}
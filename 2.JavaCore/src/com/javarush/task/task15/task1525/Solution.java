package com.javarush.task.task15.task1525;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            Scanner scanner = new Scanner(new File(Statics.FILE_NAME));
            while(scanner.hasNextLine())
                lines.add(scanner.nextLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        if ("moon".equals(key))
            thePlanet = Moon.getInstance();
        else if ("earth".equals(key))
            thePlanet = Earth.getInstance();
        else if ("sun".equals(key))
            thePlanet = Sun.getInstance();
        else
            thePlanet = null;
    }
}

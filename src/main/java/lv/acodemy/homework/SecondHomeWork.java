package lv.acodemy.homework;

import java.util.Arrays;

public class SecondHomeWork {
    public static void main(String[] args) {

        String[] countrys = {"Moskow", "Tallin", "Amsterdam", "Vilnus", "Latvija", "Berlin", "Stocholm", "Lisabon", "Praha", "Barcelona"};
        System.out.println(Arrays.toString(countrys));
        System.out.println("I love " + countrys[2]);

        for (String euroCity : countrys) {
            if (euroCity.equals("Amsterdam")) {
                System.out.println("OooOOOoooo nice city!!!There is a GOOD wead!!!");
            } else if (euroCity.equals("Latvija")) {
                System.out.println(countrys[4] + " is my motherland");
            } else {
                System.out.println(euroCity.equals("Antarktida"));
            }
        }

        String[] words = {"Sometimes ", "it ", "pays ", "to ", "stay ", "in ", "bed ", "on ", "Monday, ",
                "rather ", "than ", "spending ", "the ", "rest ", "of ", "the ", "week ",
                "debugging ", "Monday`s ", "code."};
        for (String text : words) {
            System.out.printf(text);
        }

        double[] totalSalary = {3777.22, 5888.66, 11347.99, 5611, 8456, 13487};
        for (double salary : totalSalary) {
            if (salary <= 4999) {
                System.out.println("\nYour salary is low. " + salary);
            } else if (salary <= 9999) {
                System.out.println("Your salary is average. " + salary);
            } else {
                System.out.println("Your salary is high. " + salary);
            }
        }

        int[] numbers = {1, 4, 6, -7,-13, 0};
        for (int num : numbers)
            if (num == 0) {
                System.out.println("The number is zero. " + num);
            } else if (num > 0) {
                System.out.println("The number is positive. " + num);
            } else {
                System.out.println("The number is negative. " + num);
            }

    }
}


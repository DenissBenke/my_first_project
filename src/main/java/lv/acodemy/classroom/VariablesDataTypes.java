package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        // byte data type
        byte myCurrentAge = 127;
        System.out.println(myCurrentAge);

        //short data type
        short salaryPerMonth = 999;
        System.out.println(salaryPerMonth);

        //char data type
        char firstNameLatter = 68;
        System.out.println(firstNameLatter);

        //int data type
        int dateOfBirth = 19860307;
        System.out.println(dateOfBirth);

        //Long data type
        long populationOfLatvija = 1880000;
        System.out.println(populationOfLatvija);

        //floot data type
        float lapTime = 32.34F;
        System.out.println(lapTime);

        //double data type
        double weight = 74.3;
        System.out.println( weight);

        //boolean is; has;

        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasAppels = true;

        System.out.printf("%s %s %s \n", isWinter, isSpring, hasAppels);

        //String
        String name = "Deniss";
        String surName = "Benke";
        String fatherName = "Sergeevich";
        System.out.printf(fatherName);

        //concutenation
        String fullName = name + "" +surName;
        System.out.println(fullName);

        String fullNameWithAge = fullName + myCurrentAge;

        System.out.printf("My full name is %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is %s. I am %d years old.\n", fullName, myCurrentAge);

        // *
        int a = 111;
        int b = 33;
        int c = a * b;
        System.out.println(c);
        System.out.println(111 * 33);
        System.out.println(a * b);
        System.out.println("111 * 33");

        // / division
        double result = (double) a / b;
        System.out.println(result);

        // %
        int number = 111 % 27;
        System.out.println(number);

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        for (int num : numbers){
            if(num % 2 == 0){
                System.out.println("This is even number:" + num);
            }
        }
    }
}

package lv.acodemy.classroom;

public class ifElse {
    public static void main(String[] args) {

        // IF
        /*
        if(condition){
        code to be executed
        }

        */
//        boolean x = 5 > 2;
//        System.out.println(x);
//
//        if(x) {
//            System.out.println("Yes, 5 is more than 2");
//        }

        int number = 21;
        if (number % 2 == 0) {
            System.out.println("Number: " + number + " is even");
        } else {
            System.out.println("Number: " + number + " is NOT even number");
        }

//        int age = 17;
//        if(age <= 17) {
//            System.out.println("You are not allowed to buy here!");
//        } else {
//            System.out.println("Welcome to our shop!");
//        }

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Summer month: June, July, August");
        }

        //IF-ELSE-IF
        /*
        if(condition) {
        code be executed
        } else if(condition) {
        code be executed
        } else {
        code be executed
         */

//        int age = 17;
//        if (age <= 17) {
//            System.out.println("You are not allowed to buy here!");
//        } else if (age < 0) {
//            System.out.println("Who are you?");
//        } else {
//            System.out.println("Welcome to our shop!");
//        }
//        boolean isEvenNumber = 30 % 2 == 0;
//        System.out.println(isEvenNumber);

        int age = 19;
        if (age <= 0) {
            System.out.println("Are 0 or less is not allowed");
        } else if (age <= 17) {
            System.out.println("You are not allowed to buy here!");
        } else {
            System.out.println("Welcome to our shop!");
        }
        // IF John = Hello John!
        // IF Zina = You are not welcome!
        // All other = text

        String name = "John";
        if (name.equals("John")) {
            System.out.println("Hello John");
        } else if (name.equals("Zina")) {
            System.out.println("You are not welcome");
        } else {
            System.out.println("Very interesting name!");
        }

        // switch case;
        // || --> OR
        // %% --> AND

        int currentMonth = 7;
        switch (currentMonth) {
            case 12, 1, 2 -> System.out.println("This is winter");
            case 3, 4, 5 -> System.out.println("This is spring");
            case 6, 7, 8 -> System.out.println("This is summer");
            case 9, 10, 11 -> System.out.println("This is autumn");
            default -> throw new IllegalArgumentException("Unexpected value:" + currentMonth);
        }

        String student1 = "Inakentij";
        String student2 = "Afrodita";
        if (student1.equals("Inakentij") || student2.equals("Afrodita")) {
            System.out.println("They will work together!");
        }
    }
}


package lv.acodemy.homework;

import java.util.Arrays;

public class FirstHomeWork {
    public static void main(String[] args) {

        // about parents
        byte matherAge = 59;
        byte fatherAge = 59;
        System.out.println("Mather age:" + matherAge);
        System.out.println("and Father age:" + fatherAge);

        //days in year
        short daysInYear = 365;
        short leapYear = 366;
        System.out.println(daysInYear + "-days in regular year but in leap Year-" + leapYear);

        // mather middle name
        char firstLeater = 71;
        char secondLeater = 114;
        char thirdLeater = 105;
        char foursLeater = 98;
        char fifthLeater = 107;
        char sixLeather = 111;
        System.out.println("Elena " + firstLeater + secondLeater + thirdLeater + foursLeater + sixLeather + fifthLeater);

        // father & mather maried
        int myDateofBirth = 19860703;
        int fatherMatherMaried = 11091985;
        System.out.println("My parents was merried at " + fatherMatherMaried);

        // global covid-19 infected and death

        long covidInfected = 675860714;
        long covidDeath = 6876859;
        System.out.println(covidInfected + "-total people infected in WORLD by COVID-19 and TOTAL death is-" + covidDeath);

        //money in World

        float moneyCash = 80.9F;
        float moneyCrypto = 196.5F;
        double gold = 10.4;
        double bitCoin = 156.52;
        double ethereum = 17.50;
        System.out.println(moneyCash +":trillion USD in cash but in gold:" + gold);
        System.out.println(bitCoin + ":world have Bitcoin and Eth:" +ethereum);
        System.out.println(moneyCrypto + ":trillion USD TOTAL in crypto");

        //about me
        boolean isPlayHockey = true;
        boolean hasWork = true;
        boolean isPlayFootball = false;
        System.out.println(isPlayFootball);

        //composition about me
        String sport = "hockey";
        String name = "Deniss";
        String wasBorn = "USSR";
        System.out.println(wasBorn);

        String beggin = name + wasBorn + myDateofBirth;
        System.out.println(beggin);

        System.out.printf("My name is %s." +
                        "I was born in %s... at %d!!!\n" +
                        "My mather is %d old, and Father %d yers old." +
                        "They was merried at %d.\n",
                name, wasBorn, myDateofBirth, matherAge, fatherAge, fatherMatherMaried);
        System.out.printf("From 5 yers I playd %s." +
                "I tried play football but is not for me!\n" +
                "Did Deniss have work? Yes it`s %s.\n" +
                "Did Deniss burn in %s. And from child yers play football?\n" +
                "Yep, It`s %s! becouse he was born in %d but about football is %s!!!\n",
                sport,hasWork, wasBorn, isPlayHockey, myDateofBirth, isPlayFootball);

        // testing

        long a = covidInfected;
        long b = covidDeath;
        long c = a / b;
        int d = 3;
        short f = daysInYear;
        double result = (double) a / b;

        System.out.println(result);
        System.out.println(c);
        System.out.println(a * b);
        System.out.println(a + b / d);
        System.out.println(f);
        System.out.println(b / f);

        int numbers = 18840 % 33;
        System.out.println(numbers);

        double[] num = {18840, 33333333, 464779883, 19860703, 11091985, 678153};
        System.out.println(Arrays.toString(num));

        for(double i = 0; i < num.length; i++){
            if(num[(int) i] % 2 == 0) {
                System.out.println("This is even number:" + num[(int) i]);
            }
        }
    }
}

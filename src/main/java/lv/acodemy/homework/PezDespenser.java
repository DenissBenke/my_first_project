package lv.acodemy.homework;

import lombok.Getter;

@Getter
public class PezDespenser {

    private String pezName;
    private String siriesName;
    private String color;
    private int candyAmaunt;
    private final int CANDY_MAX = 12;

    public PezDespenser(String pezName, String siriesName, String color, int candyMax) {
        this.pezName = pezName;
        this.siriesName = siriesName;
        this.color = color;
        this.candyAmaunt = CANDY_MAX;
    }

    public void eat(int candyAmo) {
        if (candyAmaunt == candyAmo && candyAmo >= 0) {
            System.out.println("Nam-Nam " + candyAmo + " candys You eated!");
            candyAmaunt = (candyAmaunt - candyAmo);
        } else {
            System.out.println("You can`t eat : " + candyAmo + " candys " + " In despenser: " + getCandyAmaunt() + " candys.");
        }
    }

    public void tryCandy() {
        if (candyAmaunt <= CANDY_MAX && candyAmaunt >= 1) {
            System.out.println("oooOOoooOOOooo Nam-Nam " + getCandyAmaunt() + " candys to go fill dispenser.");
            candyAmaunt--;
        } else {
            System.out.println("Your PEZ is empty, Nead to fill PEZ.");
        }
    }

    public void fill() {
        if (candyAmaunt == CANDY_MAX) {
            System.out.println("You`r PEZ is full of candys!");
        } else {
            candyAmaunt = candyAmaunt + 1;
            System.out.println("You will add candy in Your PEZ");
        }
    }

    public void fillCandy(int amount) {
        if (amount > CANDY_MAX) {
            System.out.println("Your Pez Dispenser don't have that much  space for candies!");
        } else if (amount > (CANDY_MAX - candyAmaunt)) {
            System.out.println("Your Pez Dispenser don't have that much  space for candies!");
        } else {
            candyAmaunt += amount;
            System.out.println("You just added  " + amount + " candys in dispenser.");
        }
    }
}







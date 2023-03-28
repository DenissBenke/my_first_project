package lv.acodemy.homework;

public class Pokemon {
    public static void main(String[] args) {
        PezDespenser pikachu = new PezDespenser ("Pikachu", "POKEMON", "Yellow", 12);
        System.out.println("This is LIMITED EDITION PEZ Dispenser!");
        System.out.println("PEZ Despenser siries: " + pikachu.getSiriesName());
        System.out.println("NAME: " + pikachu.getPezName());
        System.out.println("COLOR: " + pikachu.getColor());
        System.out.println("You have: " + pikachu.getCandyAmaunt() + " candys!");

//        System.out.println("In Your PEZ: " + pikachu.getCandyAmaunt() + " Candys!");
//        pikachu.eat(13);
//        System.out.println("In Your PEZ: " + pikachu.getCandyAmaunt() + " Candys!");
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        System.out.println("In Your PEZ: " + pikachu.getCandyAmaunt() + " Candys!");
//        pikachu.fill();
//        pikachu.fill();
//        pikachu.fill();
//        pikachu.fill();
//        pikachu.fill();
//        pikachu.fill();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        pikachu.tryCandy();
//        System.out.println("In Your PEZ: " + pikachu.getCandyAmaunt() + " Candys!");
//        pikachu.eat(10);
//        System.out.println("In Your PEZ: " + pikachu.getCandyAmaunt() + " Candys!");
//        pikachu.fill();
//        pikachu.fill();
//        pikachu.fill();
//        pikachu.eat(6);
//        System.out.println("In Your PEZ: " + pikachu.getCandyAmaunt() + " Candys!");

        pikachu.eat(12);
        System.out.println("In Your PEZ: " + pikachu.getCandyAmaunt() + " Candys!");
        pikachu.fillCandy(10);
        pikachu.fillCandy(6);
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.fillCandy(3);
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.tryCandy();
        pikachu.fill();
        pikachu.fill();
        pikachu.fill();
        pikachu.fillCandy(0);
        System.out.println("In Your PEZ: " + pikachu.getCandyAmaunt() + " Candys!");

    }
}
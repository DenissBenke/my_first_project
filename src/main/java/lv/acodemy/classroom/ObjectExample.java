package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {

        Cat barsik = new Cat("Silvestor Valerievich");
        System.out.println(barsik.getAge());
        System.out.println(barsik);

        barsik.speak();
        barsik.feed();

        // creat getters and setters: weight
        // For all other fields create getter method

        barsik.setAge(4);
        System.out.println(barsik.getAge());

        barsik.setWeight(1.75);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);

        // Creat Constructor with name, color, breed, gender, hasFur

        Cat zorik = new Cat("Zorik", "black", "unknown", "male", true);
        zorik.setWeight(7.2);
        zorik.setAge(6);
        System.out.println(zorik);
        System.out.printf("My cat`s name is: %s. My cat is %d years old. \n", zorik.getName(), zorik.getAge());

        zorik.walk();
        zorik.walk();
        zorik.walk();
        zorik.walk();
        zorik.walk();
        zorik.walk();
        System.out.println(zorik.getEnergy());

        zorik.feed();
        zorik.feed();
        zorik.feed();
        zorik.feed();
        zorik.feed();
        zorik.feed();

        // Update method feed, so we can feed our cat;
        // Evry feed method call increase energy for 1;

    }
}

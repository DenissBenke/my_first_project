package lv.acodemy.classroom;

public class Methods {
    public static void main(String[] args) {
        printText("My name is Benedikt", 5);
        printText("Hello World!!!");

        String benStory = myStory("Benedikt", "Targarien", 127);
        System.out.println(myStory("Valera", "Kalnins", 33));
        System.out.println(benStory);
    }

    public static void printText(String text, int loopCount) {
        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);
        }
    }

    public static void printText(String text) {
        for (int i = 0; i < 10; i++) {
            System.out.println(text);

        }
    }

    public static String myStory(String name, String surname, int age) {
        return "My name is " + name + " " + surname + ". I am " + age + " years old";
    }
}

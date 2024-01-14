package basicJava;

import java.text.MessageFormat;
import java.util.Scanner;

public class conditionalsSwitch {
    public static void main(String[] args) {
        System.out.println("Conditionals learning");
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert name : ");
        String name = scan.nextLine();

        switch (name.substring(0, 1).toUpperCase()+name.substring(1, name.length()).toLowerCase()) {
            case "Mamun":
                System.out.println("Good morning " + name);
                break;
            case "Ashik":
                System.out.println("Good morning  " + name);
                break;
            default:
                System.out.print("Who are you " + name + " ?");
                break;
        }

    }
}

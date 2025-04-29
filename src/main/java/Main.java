/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // create a new object of class Main
        String name;
        // call the compute() method on that new object
        compute();
    }


    public static void compute() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        // Get input string of name from user

        // Create conditional to check name against Alice and Bob

        if (name.equalsIgnoreCase("alice") ||
                name.equalsIgnoreCase("bob")) {
            System.out.println("Hello, " + name + "!");

        } else {
            System.out.println("You are neither Alice nor Bob");
        }
    }
}

        // Get input string of name from user

        // Create conditional to check name against Alice and Bob

        // Print greeting to screen if Alice or Bob are true

        // Print "You are neither Alice nor Bob." otherwise


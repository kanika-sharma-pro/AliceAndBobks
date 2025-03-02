/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {
 private String name;
 public Main(String name) {
     this.name = name;
 }
    // create a new object of class Main
        // call the compute() method on that new object

    public static void main(String[] args ) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name : ");
            String name = scanner.nextLine().trim();
        Main mainObject = new Main();
        mainObject.compute();
        }
 public void compute() {
            if(name.equalsIgnoreCase("alice") ||
                    name.equalsIgnoreCase("bob"))
            {
                System.out.println("Hello, " + name + "!");

                }
 }
                else static {
                    System.out.println("You are neither Alice nor Bob");
                }
                }

        // Get input string of name from user
        
        // Create conditional to check name against Alice and Bob

        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise


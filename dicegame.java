import java.util.Random;
import java.util.scanner;

public class DiceGame {
    public static void main(String[] args) {
        greeting();
        rollDice();
        
    }

    public static void rollDice() {
        System.out.println("Rolling dice...");
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + (die1 + die2));
        if ((die1 + die2) >= 7 ) System.out.println( name +" won!");
        else System.out.println(name +" lost");
    }

    public static void greeting() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name?");
        
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "!")
    }
}
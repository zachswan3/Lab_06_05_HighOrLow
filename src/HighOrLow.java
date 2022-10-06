import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        //Write a program that has the computer generate a random int value between 1 to 10 inclusive.  The program then
        // asks the user to guess the number with a single guess.  The program displays the random number and then
        // indicates if the users guess was high low or on the money!

        int guess = 0;
        String trash;
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;

        System.out.println("Please guess a number [1-10]");
        if (scanner.hasNextInt()){
            guess = scanner.nextInt();
            scanner.nextLine();
        }
        else{
            trash = scanner.nextLine();
            System.out.println("The value you entered is invalid please try again.");
            System.exit(0);
        }

        System.out.println("The random number was " + val);

        if (val == guess){
            System.out.println("You were on the money!");
        } else if (val < guess) {
            System.out.println("Your guess was too high!");
        }
        else if (val > guess) {
            System.out.println("Your guess was too low!");
        }


    }
}

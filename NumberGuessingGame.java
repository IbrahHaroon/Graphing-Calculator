import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create a win count variable
        int winCount = 0;
        // Generate a Random
        Random random = new Random();

        // Generate a scanner
        Scanner scan = new Scanner(System.in);
        
        // Run a loop for the game to run with a boolean
        boolean running = true;
        while(running){
            //Create the target
            int target = random.nextInt(100) + 1;
            //Ask for a guess and store
            System.out.println("Enter your guess: ");
            int userGuess = scan.nextInt();
            //Run another loop while the answer is wrong
            while(userGuess != target){
                // If the guess is too high or two low, print a statement for it
                if(userGuess > target){
                    System.out.println("Your guess is higher than the target. Try again.");
                }else{
                    System.out.println("Your guess is lower than the target. Try again.");
                }
            }
            // Let the user guess again
            System.out.println("Enter your next guess: ");
            userGuess = scan.nextInt();
        }
        //Update a win count and congratulate the player
        winCount++;
        System.out.println("Congratulations, you won! Here is your win count: " + winCount);

        //Ask for another try
        System.out.println("Do you want to play again? (yes/no)");
        String playAgain = scan.next();
        running = playAgain.equalsIgnoreCase("yes");
    }
}
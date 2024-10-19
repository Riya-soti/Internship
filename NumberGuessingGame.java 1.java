import java.util.Random;
imoort java.util.Scanner;
public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do
        {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 5;
            int score = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess a number between 1 to 100.You have " + attempts + "attempts left.");

            while(attempts > 0 && !hasGessedCorrectly)
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts---;

                if(userGuess == numberToGuess)
                {
                    hasGuessCorrectly = true;
                    score = 6- attempts;
                    System.out.println("Congratulations! You've guessed the number " + numberToGuess + "!");
                }
                else if (userGuess < numberToGuess)
                {
                    System.out.println("Too low! You have " + attempts +" attempts left.");
                }
                else
                {
                    System.out.println("Too high! You have " + attempts + " attempts left.");
                }
            }

            if (!hasGuessedCorrectly)
            {
                System.out.println("Sorry! You have run out of attempts. The number was " + numberToGuess + ".");
            }

            System.out.println("Your score: " + score);
            System.out.print("Do you want to play again? (yes/no) : ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        } 
        while(playAgain);
        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
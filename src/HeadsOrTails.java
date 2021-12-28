import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {

        
        int Heads_Tails = (int) (Math.random() * 2);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the guess: ");
        int user_guess = userInput.nextInt();

        if (user_guess == Heads_Tails) {
            System.out.println(user_guess + " Correct guess is " + Heads_Tails);
        } else {
            System.out.println("Try again");
        }

    }
}

import java.util.*;
public class NumberGame {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r = new Random();
        boolean playagain = true;
        int score = 0;
        while (playagain) {
            int targetnum = r.nextInt(100)+1;
            int attempts =0;
            boolean guesscorrectly = false;

            System.out.println("Welcomr to NumberGame");
            System.out.println("Can you Guess the Number that I've picked from 1 to 100");

            while (!guesscorrectly) {
                System.out.println("Enter your Guess");
                int Guess = sc.nextInt();
                attempts++;
                if (Guess == targetnum) {
                    System.out.println("Your Guess was correct");
                    guesscorrectly = true;
                    score+= attempts;
                    
                }
                else if (Guess < targetnum) {
                    System.out.println("Your Guess is too Low!");
                    
                }
                else
                {
                    System.out.println(" Your Guess is too High!");
                }
                

            }
            System.err.println("Want to play again");;
            String playagainin = sc.next();
            if(!playagainin.equalsIgnoreCase("yes"))
            {
                playagain = false;
            }

            System.out.println("Your Total score is :" +score);
        }
    }
}
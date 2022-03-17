package Exercises;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args)
	{

		int secret;//Declares variable
		 
        secret = (int) (Math.random() * 20 + 1);//Generates a random number from 1 to 20           
 
        Scanner num = new Scanner(System.in);//Allows users number to be recorded
 
        int guess;
 
        do {
 
              System.out.print("Enter a number between 1 and 20: ");//Prompts user for a number between 1 and 20
 
              guess = num.nextInt();//Records number that the user enters
 
              if (guess == secret)
 
                    System.out.println("Your guessed it. Congratulations!");//If the guess equals the secret number then it outputs message in orange
 
              else if (guess < secret)
 
                    System.out.println("Too low.");//If the guess is lower than the secret number then it outputs message in orange
 
              else if (guess > secret)
 
                    System.out.println("Too High.");//If the guess is greater than the secret number then it outputs message in orange
 
        } while (guess != secret);//Does all of the following if the user's number does not match the secret number
          num.close();


	}

}

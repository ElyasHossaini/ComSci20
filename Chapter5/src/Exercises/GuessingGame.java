/*
 
Program:.java          Last Date of this Revision: February 24, 2022
 
Purpose:
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
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
/*
Enter a number between 1 and 20: 2
Too low.
Enter a number between 1 and 20: 4
Too low.
Enter a number between 1 and 20: 19
Too High.
Enter a number between 1 and 20: 12
Too low.
Enter a number between 1 and 20: 13
Too low.
Enter a number between 1 and 20: 15
Too low.
Enter a number between 1 and 20: 17
Your guessed it. Congratulations!
*/
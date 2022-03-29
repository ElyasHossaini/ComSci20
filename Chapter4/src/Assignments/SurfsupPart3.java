/*
 
Program:.java          Last Date of this Revision: February 24, 2022
 
Purpose:Modify the SurfsUp application to display "Great day for surfing." when the waves are 6 feet or over and "Go body boarding." when the waves between 3 and 6 feet. "Go for a swim." when the waves are from 0 to 3 feet and "Whoa! What kind of surf is that?" otherwise.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

import java.util.Scanner;

public class SurfsupPart3 {

	public static void main(String[] args) 
	{

		  Scanner input = new Scanner(System.in);
	      
		  System.out.println("Please enter the height of the wave in feet:");//Prompts user for height of wave
	      int wave = input.nextInt();//Records number that the user enters
	      input.close();
	      if (wave >= 6)//Checks if wave is 6 feet or higher
	      {
	        System.out.println("Great day for surfing!");//Displays Great day for surfing! if condition is correct
	      }
	      else if ((3<wave) && (6>wave))//Checks if wave is between 3 and 6 feet
	 
	      {
	        System.out.println("Go body boarding!");//Displays Go body boarding! if condition is correct
	      }
	      else if ((0<wave) && (3>=wave))//Checks if wave is between 0 and 3 feet
	      {
	        System.out.println("Go for a swim");//Displays Go for a swim if condition is correct
	      }
	      else 
	      {
	        System.out.println("Whoa! What kind of surf is that?"); //Displays Whoa! What kind of surf is that? if no conditions are correct
	      }


	}

}
/*
Please enter the height of the wave in feet:
8
Great day for surfing!
Please enter the height of the wave in feet:
5
Go body boarding!
Please enter the height of the wave in feet:
3
Go for a swim
Please enter the height of the wave in feet:
0
Whoa! What kind of surf is that?
*/
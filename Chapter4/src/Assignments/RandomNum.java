/*
 
Program:.java          Last Date of this Revision: March 14, 2022
 
Purpose:
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 

*/
package Assignments;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) 
	{

		    Scanner input = new Scanner(System.in);
	        
	        
	        System.out.println("\nEnter a min number: ");//prompt user to enter a min number
	        int min = input.nextInt();//Records min number
	        
	        System.out.println("\nEnter a max number: ");//prompt user to enter a max number
	        int max = input.nextInt();//Records max number
	        
	        input.close();
	        
	        
	        System.out.println ("The number is: " + ( (int)(max-min+1)*Math.random()+min));//displaying to user


	}

}
/*

*/
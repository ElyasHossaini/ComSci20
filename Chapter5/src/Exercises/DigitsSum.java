/*
 
Program:.java          Last Date of this Revision: February 24, 2022
 
Purpose:
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Exercises;

import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");//Prompts user for a positive integer
        int digits = input.nextInt();//Records that integer
        input.close();
        int sum = 0;//Declares variable
          
          while(digits > 0) //As long as the number is greater than 0 it executes the code in the brackets below
          {
              sum += digits % 10;//Figures out individual digits and adds them
              digits /= 10;
          }
          
          
          System.out.println("The sum of the digits is " + sum);//Prints out the sum once it is calculated
    
	
	}


	

}

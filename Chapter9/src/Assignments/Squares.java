/*
 
Program:.java          Last Date of this Revision: April 28, 2022
 
Purpose: Create a Squares application that stores the square of an element's index in an integer array of 5 elements. 
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a number 5 or higher: ");//Prompts user for a number that is 5 or higher
		int numel = input.nextInt();//Records users number
		input.close();
		int y = numel - 5;//Creates variable for range of 5 elements
		int [] num = new int[numel];//Declares array
		
		for(int x = y; x < numel; x++)//for loop that finds and stores all of the element index's
		{
			num[x] = x;
		}
		
		System.out.println("Here is the square of 5 numbers before " + numel + ":");//Prints Here is the square of 5 numbers before number inputed
		
		for(int x = numel - 1; x>=y; x--) 
		{
			System.out.println(num[x] * num[x]);//Displays all the squares of integers in reverse order
		}
		
	}

}
/*
Enter a number 5 or higher: 
8
Here is the square of 5 numbers before 8:
49
36
25
16
9
*/
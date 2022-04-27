/*
 
Program:.java          Last Date of this Revision: April 30, 2022
 
Purpose: Create a Reverse application that stores the number corresponding to the element's index in an integer array of 10 elements.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/package Assignments;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a number that is 10 or higher: ");//Prompts user for a number that is 10 or higher
		int numel = input.nextInt();//Records users number
		input.close();
		int y = numel - 10;//Creates variable for range of 10 elements
		int [] num = new int[numel];//Declares array
		
		for(int x = y; x < numel; x++)//for loop that finds and stores all of the element index's
		{
			num[x] = x;
		}
		
		System.out.println("Countdown");//Prints countdown
		
		for(int x = numel - 1; x>=y; x--) 
		{
			System.out.println(num[x]);//Displays all the integers in reverse order
		}
 
	
	



	}

}
/*
Enter a number that is 10 or higher: 
12
Countdown
11
10
9
8
7
6
5
4
3
2

*/
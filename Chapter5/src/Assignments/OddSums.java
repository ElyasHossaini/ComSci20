/*
 
Program:.java          Last Date of this Revision: February 24, 2022
 
Purpose:Create an OddSums application that prompts the user for a number and then sums the odd numbers from 1 to the number entered.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

import java.util.Scanner;

public class OddSums {

	public static void main(String[] args) 
	{

		Scanner input=new Scanner(System.in);
        int num, num2=1, add=0;//Declares variables
        
        System.out.println("Enter a number");//Prompts user for number
        num=input.nextInt();//Records number user enters
        input.close();
        
        do
        {
        num2+=2;//Adds two each time
        add+=num2 - 2;//Adds the number each time to the previous number/numbers(Adds the odd numbers)
        }while(num2<=num);//Executes the two lines above as long as the original number entered by the user is larger than the new number created each time
        
        System.out.println("The sum of the odd numbers from 1 to " + num +" is "+ add);//Prints the sum of the odd numbers


	}

}
/*
Enter a number
8
The sum of the odd numbers from 1 to 8 is 16
*/
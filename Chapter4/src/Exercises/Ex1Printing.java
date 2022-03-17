/*
 
Program:.java          Last Date of this Revision: March 14, 2022
 
Purpose:
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 

*/
package Exercises;

import java.util.Scanner;

public class Ex1Printing {

	public static void main(String[] args) 
	{
		
		   Scanner userinput = new Scanner(System.in);
	       
		   System.out.println("How many sheets of paper do you need? ");//Asks user how many sheets of paper they need
	       
		   double paper = userinput.nextInt();//Records number they enter
	       userinput.close();
	       
	       if (paper < 99)//Checks condition
	       {
	           System.out.println("Price per copy is $0.30" );
	           System.out.println("Total cost is: $" + (paper*3)/10 );//Ouputs messages in orange if condition is correct
	       }
	       else if ((paper < 499)&&(paper > 100))//Checks condition
	       {
	           System.out.println("Price per copy is $0.28" );
	           System.out.println("Total cost is: $" + (paper*28)/100 );//Ouputs messages in orange if condition is correct
	       }
	        else if ((paper < 749)&&(paper > 500))//Checks condition
	       {
	           System.out.println("Price per copy is $0.27" );
	           System.out.println("Total cost is: $" + (paper*27)/100 );//Ouputs messages in orange if condition is correct
	       }
	         else if ((paper < 1000)&&(paper > 750))//Checks condition
	       {
	           System.out.println("Price per copy is $0.26" );
	           System.out.println("Total cost is: $" + (paper*26)/100 );//Ouputs messages in orange if condition is correct
	       }
	       else 
	       {
	           System.out.println("Price per copy is $0.25" );
	           System.out.println("Total cost is: $" + (paper*25)/100 );//Ouputs messages in orange if no conditions are correct
	       }


	}

}
/*
How many sheets of paper do you need? 
7
Price per copy is $0.30
Total cost is: $2.1
*/
/*
 
Program:.java          Last Date of this Revision: March 14, 2022
 
Purpose:Create a Grade application that prompts the user for the percentage earned on a test or other graded work and then displays the corresponding letter grade.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 

*/
package Exercises;

import java.util.Scanner;

public class Ex5Grades {

	public static void main(String[] args) 
	{

		   Scanner userinput = new Scanner(System.in);
	      
		   System.out.println("Enter your grade: ");//Prompts user for a grade
	       int grade = userinput.nextInt();//Records the grade that the user enters
	       userinput.close();
	       if (grade >= 90)//Checks if grade is 90 or above
	       {
	           System.out.println("Your grade letter is A");//Displays message in orange if condition is correct
	       }
	       else if ((grade <= 89)&&(grade >= 80))//Checks if grade is between 80 and 89
	       {
	           System.out.println("Your grade letter is B ");//Displays message in orange if condition is correct
	       }
	       else if ((grade <= 79)&&(grade >= 70))//Checks if grade is between 70 and 79
	       {
	           System.out.println("Your grade letter is C ");//Displays message in orange if condition is correct
	       }
	       else if ((grade <= 69)&&(grade >= 60))//Checks if grade is between 60 and 69
	       {
	           System.out.println("Your grade letter is D ");//Displays message in orange if condition is correct
	       }
	      
	       else 
	       {
	           System.out.println("Your grade letter is F ");//Displays message in orange if no conditions are correct
	       }


	}

}
/*
Enter your grade: 
97
Your grade letter is A
*/
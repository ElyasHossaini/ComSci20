/*
 
Program:.java          Last Date of this Revision: April 28, 2022
 
Purpose: Create a StudentRoster application that prompts the user for the number of students ina class and then prompts the user for each student's name and stores the names in an array.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) 
	{
	
		System.out.println("Enter the number of students in the class: "); //prompts user for number of students
		 
		Scanner input = new Scanner(System.in); 
 
		int studentNum = input.nextInt(); //records number user entered
 
		String[] names = new String[studentNum]; //declares array 
 
		for(int i = 0; i < studentNum; i++) //for loop that checks if variable i is less than studentNum
		{
			System.out.println("Enter the student's name: "); //prompts user for name of student
 
			String nameE = input.next(); //record student's name
 
			names[i] = nameE; //gives element a name
		}
 
		System.out.println("\nStudent Roster: "); //display title
 
		for (String element: names) //traversing the array
		{
			System.out.println(element); //display all of the student names
		}
		
		input.close();
 
		
	}

}
/*
Enter the number of students in the class: 
10
Enter the student's name: 
Elyas
Enter the student's name: 
Bryce
Enter the student's name: 
Nathanial
Enter the student's name: 
Jacob
Enter the student's name: 
Nolan
Enter the student's name: 
Andrew
Enter the student's name: 
Aleksa
Enter the student's name: 
Aiden
Enter the student's name: 
Marco
Enter the student's name: 
Luffy

Student Roster: 
Elyas
Bryce
Nathanial
Jacob
Nolan
Andrew
Aleksa
Aiden
Marco
Luffy
*/
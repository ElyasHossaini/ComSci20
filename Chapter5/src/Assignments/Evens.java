/*
 
Program:.java          Last Date of this Revision: February 24, 2022
 
Purpose:Create an Evens application that displays the even numbers between 1 and 20, inclusive.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

public class Evens {

	public static void main(String[] args) 
	{

		    int x = 0;//Defines variable x
            while ( x <= 20 )//As long as x is less than or equal to 20 it does the following 
        { 
            x = x + 1;//1 is added to x
            if ( x % 2 == 0)//Checks to see if the remainder of x divided by 2 equals 0
        {   
            System.out.print(" " + x);//Outputs x is the condition is correct
        }
        
        }


	}

}
/*
 2 4 6 8 10 12 14 16 18 20
*/
/*
 
Program:.java          Last Date of this Revision: March 14, 2022
 
Purpose:
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 

*/
package Assignments;

import java.util.Scanner;

public class Hurricance {

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
        
		System.out.println("Please Enter A Hurricane Category 1-5: ");
        
		int Hurricane = input.nextInt();
        
		input.close();
        
		System.out.println("The Hurricane Category You Entered Is: " + Hurricane);
        
        if (Hurricane == 1)
        {
        System.out.println("Your Hurricane Is 74-95 mph or 64-82 kt or 119-153 km/hr");
        }
 
        if (Hurricane == 2)
        {
        System.out.println("Your Hurricane Is 96-110 mph or 83-95 kt or 154-177 km/hr");
        } 
        
        if (Hurricane == 3)
        {
        System.out.println("Your Hurricane Is 111-130 mph or 96-113 kt or 178-209 km/hr");
        }
        
        if (Hurricane == 4)
        {
        System.out.println("Your Hurricane Is 131-155 mpr or 114-135 kt or 210-249 km/hr");
        }
        
        if (Hurricane == 5)
        {
        System.out.println("Your Hurricane Is Great That 155 mph or 135 kt or 249 km/hr");
        }


	}

}
/*
Please Enter A Hurricane Category 1-5: 
4
The Hurricane Category You Entered Is: 4
Your Hurricane Is 131-155 mpr or 114-135 kt or 210-249 km/hr
*/
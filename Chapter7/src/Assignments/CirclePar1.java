/*
 
Program:.java          Last Date of this Revision: April 25, 2022
 
Purpose: Modify the ReviewCircle class to include a member method named circumference. 
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

public class CirclePar1 {

	public static void main(String[] args) 
	{

		ReviewCircle spot = new ReviewCircle();
		
		spot.setRadius(3);
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle circumfrance: " + spot.circumference());
		

	}
}
/*
Circle radius: 3.0
Circle circumfrance: 18.84
*/

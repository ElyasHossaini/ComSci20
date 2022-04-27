/*
 
Program:.java          Last Date of this Revision: April 25, 2022
 
Purpose: Modify the ReviewCircle class to include an overload constructor that accepts the radius of the circle object, as shown in the previous section.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

public class CirclePart2 {

	public static void main(String[] args) 
	{

		ReviewCircle spot = new ReviewCircle(9); //overloads constructor to 9
		

		System.out.println("Circle radius: " + spot.getRadius()); //displays radius of circle
		System.out.println("Circle circumfrance: " + spot.circumference()); //displays circumfrance of circle
		

	}

}
/*
Circle radius: 9.0
Circle circumfrance: 56.52
*/
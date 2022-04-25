/*
 
Program:.java          Last Date of this Revision: April 25, 2022
 
Purpose: Modify the ReviewCircle class to override the equales() and toString() methods, as shown in the previous section.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

public class CirclePart4 {

	public static void main(String[] args) 
	{

		ReviewCircle spot1 = new ReviewCircle(3);
		ReviewCircle spot2 = new ReviewCircle(4);
		
		if (spot1.equals(spot2)) {
			System.out.println("Objects are equal.");
		} else {
			System.out.println("Objects are not equal.");
		}
		System.out.println(spot1);
		System.out.println(spot2);
		
		}

	

}
/*
Objects are not equal.
Circle has radius 3.0
Circle has radius 4.0

*/
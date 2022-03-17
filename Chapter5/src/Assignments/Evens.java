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

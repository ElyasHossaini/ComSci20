package Assignments;

import java.util.Scanner;

public class NumberSums {

	public static void main(String[] args) 
	{

		int num, sum=0,num1=0;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a number:");//Prompts user for a number
        num=input.nextInt();//Records number that the user entered
        input.close();
        
        do{
        System.out.println(num1);//Prints the number
        num1 += 1;//Adds one to the users number each time
        sum += num1 - 1;//Adds the new number each time to the previous number/numbers.
        }
        while(num1<=num);//It does the three lines of code above this only if the new number created each time does not exceed the original number.
        System.out.println("The sum is " + sum);//Prints sum


	}

}

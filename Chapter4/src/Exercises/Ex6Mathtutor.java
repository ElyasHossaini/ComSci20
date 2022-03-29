/*
 
Program:.java          Last Date of this Revision: March 14, 2022
 
Purpose:Create a MathTutor application that displays math problems by randomly generating two numbers, 1 through 10 and an operator (*,+,-,/) and then prompts the user for the answer.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 

*/
package Exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex6Mathtutor {

	public static void main(String[] args) 
	{

		Scanner userinput = new Scanner(System.in);
        String a;
 
        do{
 
        String operatorSwitch;
        int b;
        int c = 0;
        //Assigns variables
        
        Random number = new Random();
        int d = number.nextInt(10) +1;//Random number is chosen
        int e = number.nextInt(10) +1;//Second Random number is chosen
 
        Random operatorChoice = new Random();
        int operator = operatorChoice.nextInt(4);//Random operation is chosen
 
        switch (operator){
 
            case 0: operatorSwitch= "+";
                c = d+e;
                break;
            case 1: operatorSwitch= "-";
                c = d-e;
 
                break;
            case 2: operatorSwitch= "*";
                c = d*e;
                break;
            case 3: operatorSwitch= "/";
                c = d/e;
                break;
            default: operatorSwitch= "";
        }
        System.out.println("What is: "+d+operatorSwitch+e+"?");//Prompts user for answer to question
        b = userinput.nextInt();//Records answer
 
 
        if(b!=c)//Checks condition
            System.out.println("Wrong answer! Right answer is: "+c);//Displays message in orange if condition is correct
        else{if(b==c)//Checks condition
            System.out.println("Right answer!"+c);//Displays message in orange if condition is correct
        }
            System.out.println("Continue? y/n");//Prompts user if they want to continue or no
            a = userinput.next();//Records what the user enters
            
 
        }while(a.equals("y"));//Continues application if user enters "y"
        userinput.close();


	}

}
/*
What is: 2/1?
2
Right answer!2
Continue? y/n
y
What is: 10/1?
10
Right answer!10
Continue? y/n
y
What is: 1+1?
2
Right answer!2
Continue? y/n
y
What is: 5-10?
-5
Right answer!-5
Continue? y/n
n

*/

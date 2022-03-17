package Assignments;

import java.util.Scanner;

public class AccountSetup {

	public static void main(String[] args)
	{		
		
		    String password, username;
	        int passwordLength;//Declares variables
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter a username:  ");//Prompts user for a username
	        username = input.next();//Records username
	        System.out.print("Enter a password that is at least 8 characters:  ");//Prompts user for a password with at least 8 characters
	        password = input.next();//Records password
	        passwordLength = password.length();//Records the length of the password
	        
	        while (passwordLength < 8)//Executes the next three lines if the password length is below 8 
	        {
	        System.out.print("Please enter a password that is at least 8 characters:  ");//Prompts user for a password with at least 8 characters
	        password = input.next();//Re-records password
	        passwordLength = password.length();//Re-records password length
	        }
	        input.close(); 
	        
	        System.out.println("Your username is " + username.toLowerCase() + " and your password is "+ password.toLowerCase());
	        //Converts both the password and username to lowercase and then prints them


	}

}

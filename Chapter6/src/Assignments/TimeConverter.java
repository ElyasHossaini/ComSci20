/*
 
Program:.java          Last Date of this Revision: February 24, 2022
 
Purpose:
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

import java.util.Scanner;
public class TimeConverter {
 
public static void main(String[] args) 

			{

 
				int choice, hours, minutes, days ;
 
 				Scanner input=new Scanner(System.in);
 
 				do { System.out.println("Enter 1 for hours to minutes");
 
 				System.out.println("Enter 2 for days to hours");
 
 				System.out.println("Enter 3 for minutes to hours");
 
 				System.out.println("Enter 4 for hours to days");
 
 				choice=input.nextInt();}while((choice!=1)&&(choice!=2)&&(choice!=3)&&(choice!=4));

 				if(choice==1){
	 			
	 			System.out.println("Enter the amount of hours: ");
 
 				hours=input.nextInt();
 
 				input.close();
 
 				minutes=hours*60;
 
 				System.out.println(minutes+" minutes in "+hours+" hours");;
 
 				}else if(choice==2){
 
	 			System.out.println("Enter the amount of days: ");
 
 				days=input.nextInt();
 
 				input.close();
 
 				hours=days*24;
 
 				System.out.println(hours+" hours in "+days+" days");
 
 				}else if(choice==3){
 
	 			System.out.println("Enter the amount of minutes: ");
 
 				minutes=input.nextInt();
 
 				input.close();
 
 				hours=minutes/60;
 
 				System.out.println(hours+" hours in "+minutes+" minutes");
 
 				}else if(choice==4){
 
 
	 			System.out.println("Enter the amount of hours: ");
 
 				hours=input.nextInt();
 
 				input.close();
 
 				days=hours/24;
 
 				System.out.println(days+" days in "+hours+" hours");
 
 				}
 				else
 				{
	 			System.out.println("Not a valid option"); 
 				}
 				input.close();
			}
 
}
/*
Enter 1 for hours to minutes
Enter 2 for days to hours
Enter 3 for minutes to hours
Enter 4 for hours to days
1
Enter the amount of hours: 
5
300 minutes in 5 hours
Enter 1 for hours to minutes
Enter 2 for days to hours
Enter 3 for minutes to hours
Enter 4 for hours to days
2
Enter the amount of days: 
6
144 hours in 6 days
Enter 1 for hours to minutes
Enter 2 for days to hours
Enter 3 for minutes to hours
Enter 4 for hours to days
3
Enter the amount of minutes: 
978
16 hours in 978 minutes
Enter 1 for hours to minutes
Enter 2 for days to hours
Enter 3 for minutes to hours
Enter 4 for hours to days
4
Enter the amount of hours: 
564
23 days in 564 hours
*/
/*
 
Program:.java          Last Date of this Revision: May 30, 2022
 
Purpose: Create a two-player game that simulates a tug of war.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;
import com.phidget22.*;
 
public class tugofwar {
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception{
 
        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
      
        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
 
        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
 
        //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
        int click = 0;
        int click1 = 0;
        {
        	
        }
        while(true){
 
            if( 
            	redButton.getState()){
                redLED.setState(true);
                click++;
            } 
            else 
            {
                redLED.setState(false);
            }
 
            if(
            	greenButton.getState()){
                greenLED.setState(true);
                click1++;
            } 
            else
            {
                greenLED.setState(false);
            }
            
            if (redButton.getState()==true) {
            	System.out.println("Red has " + click + (" points"));
            Thread.sleep(150);} 
            
            if (greenButton.getState()==true) {
                System.out.println("Green has " + click1 + (" points"));
            Thread.sleep(150);}
            
            if (click==10) {
            		System.out.println("Red is the winner!");
            		redLED.setState(true);
                    Thread.sleep(10);
                    redLED.setState(false);
                    Thread.sleep(10);
                    greenLED.setState(true);
                    Thread.sleep(100);
                    greenLED.setState(false);
                    Thread.sleep(10);
                    redLED.setState(true);
                    Thread.sleep(100);
                    redLED.setState(false);
                    Thread.sleep(100);
                    redLED.setState(true);
                    Thread.sleep(100);
                    redLED.setState(false);
                    Thread.sleep(100);
                    redLED.setState(true);
                    Thread.sleep(100);
                    redLED.setState(false);
                    Thread.sleep(100);
                    redLED.setState(true);
                    Thread.sleep(100);
                    redLED.setState(false);
                    Thread.sleep(100);
                    redLED.setState(true);
                    Thread.sleep(100);
                    redLED.setState(false);
                    Thread.sleep(100);
                  return;
            }
            if (click1==10) {
            	{
                    greenLED.setState(true);
                    Thread.sleep(100);
                    greenLED.setState(false);
                    Thread.sleep(100);
                    greenLED.setState(true);
                    Thread.sleep(100);
                    greenLED.setState(false);
                    Thread.sleep(100);
                    greenLED.setState(true);
                    Thread.sleep(100);
                    greenLED.setState(false);
                    Thread.sleep(100);
                    greenLED.setState(true);
                    Thread.sleep(100);
                    greenLED.setState(false);
                    Thread.sleep(100);
                    greenLED.setState(true);
                    Thread.sleep(100);
                    greenLED.setState(false);
                    Thread.sleep(100);
                    greenLED.setState(true);
                    Thread.sleep(100);
                    greenLED.setState(false);
                    Thread.sleep(100);
                }
            	System.out.println("Green is the winner!");
        		
        		return;
        }
            
        }
    }
}

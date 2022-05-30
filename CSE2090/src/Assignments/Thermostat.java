/*
 
Program:.java          Last Date of this Revision: May 30, 2022
 
Purpose: In this project, your challenge is to create a simulated thermostat using your Humidity Phidget, push buttons and LEDs.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class Thermostat {
      public static void main(String[] args) throws Exception{
		 
		int setTemp = 21;
		int counter = 0;
		 
		   //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget.
		   TemperatureSensor temperatureSensor = new TemperatureSensor();
		 
		   DigitalInput redButton = new DigitalInput();
		   DigitalOutput redLED = new DigitalOutput();
		   
		   DigitalInput greenButton = new DigitalInput();
		   DigitalOutput greenLED = new DigitalOutput();
		 
		   redButton.setHubPort(0);
		   redButton.setIsHubPortDevice(true);
		   
		   redLED.setHubPort(1);
		   redLED.setIsHubPortDevice(true);
		   
		   greenButton.setHubPort(5);
		   greenButton.setIsHubPortDevice(true);
		   
		   greenLED.setHubPort(4);
		   greenLED.setIsHubPortDevice(true);
		 
		   redButton.open(1000);
		   redLED.open(1000);
		   
		   greenButton.open(1000);
		   greenLED.open(1000);
		 
		   //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
		   temperatureSensor.open(1000);
		 
		   System.out.println("Set Temperature: " + setTemp + " °C Current Temperature:" + temperatureSensor.getTemperature() + " °C" );
		   //Use your Phidgets | This code will print the temperature every 150ms
		   while (true)
		   {
		   
		   double diff = Math.abs(setTemp - temperatureSensor.getTemperature());
		 
		   if (greenButton.getState())
		   {
		 
		   setTemp++;
		 
		   }
		   else if (redButton.getState())
		   {
		 
		   setTemp--;
		   }
		 
		   if (diff <= 2)
		   {
		   redLED.setState(false);
		       greenLED.setState(true);
		   }
		   else
		   {
		   greenLED.setState(false);
		       redLED.setState(true);
		   }
		     
		       Thread.sleep(50);
		       counter++;
		     
		     
		       if (counter % 125 == 0)
		       {
		       System.out.println("Set Temperature: " + setTemp + " °C Current Temperature:" + temperatureSensor.getTemperature() + " °C" );
		 
		       }
		
		 
		}

    }
}
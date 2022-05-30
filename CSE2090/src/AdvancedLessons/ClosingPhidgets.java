/*
 
Program:.java          Last Date of this Revision: May 30, 2022
 
Purpose: You will see the temperature displayed once and then your program will end.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package AdvancedLessons;
 
//Add Phidgets Library
import com.phidget22.*;
 
public class ClosingPhidgets {
    public static void main(String[] args) throws Exception{
 
        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
 
        //Open
        temperatureSensor.open(1000);
 
        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
    }
}
  
 

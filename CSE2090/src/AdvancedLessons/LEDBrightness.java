/*
 
Program:.java          Last Date of this Revision: May 30, 2022
 
Purpose: You will see the red LED blink dimly.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package AdvancedLessons;
 
//Add Phidgets Library 
import com.phidget22.*;
 
public class LEDBrightness 
{
    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {
 
        //Create 
        DigitalOutput redLED = new DigitalOutput();
 
        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
 
        //Open 
        redLED.open(1000);
 
        //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.
        redLED.setDutyCycle(0.1);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.2);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.3);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.4);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.5);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.6);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.7);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.8);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.9);
        Thread.sleep(500);
        
        redLED.setDutyCycle(1);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.9);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.8);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.7);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.6);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.5);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.4);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.3);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.2);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.1);
        Thread.sleep(500);
        
        redLED.setDutyCycle(0.0);
        Thread.sleep(500);
        
    }
}

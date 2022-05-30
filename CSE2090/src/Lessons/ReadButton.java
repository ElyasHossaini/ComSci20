/*
 
Program:.java          Last Date of this Revision: May 30, 2022
 
Purpose: When you press the red button, you will see the button state change.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Lessons;

//Add Phidgets Library 
import com.phidget22.*;

public class ReadButton {
  //Handle Exceptions 
  public static void main(String[] args) throws Exception{
      
      //Create 
      DigitalInput redButton = new DigitalInput();

      //Address 
      redButton.setHubPort(0);
      redButton.setIsHubPortDevice(true);

      //Open 
      redButton.open(1000);

      //Use your Phidgets 
      while(true){
          System.out.println("Button State: " + redButton.getState());
          Thread.sleep(150);
      }
  }
}

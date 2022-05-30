/*
 
Program:.java          Last Date of this Revision: May 30, 2022
 
Purpose: You will see the temperature and humidity displayed.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Lessons;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ReadTempratureAndHumidity {
  public static void main(String[] args) throws Exception{

      //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
      HumiditySensor humiditySensor = new HumiditySensor();
      TemperatureSensor temperatureSensor = new TemperatureSensor();

      //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
      humiditySensor.open(1000);
      temperatureSensor.open(1000);

      //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
      while(true){
           System.out.println("Humidity: " + humiditySensor.getHumidity() + " RH%, ");
          Thread.sleep(150);
      
          if (temperatureSensor.getTemperature() < 21) {
      	System.out.print("Room is too cold, ");
          }
      	else if  (temperatureSensor.getTemperature() > 21) {
      		System.out.print("Temperature: " + temperatureSensor.getTemperature() + " �C " );
      	}
      }
  }
}
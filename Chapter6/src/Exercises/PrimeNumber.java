/*
 
Program:.java          Last Date of this Revision: February 24, 2022
 
Purpose:
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Exercises;

import java.awt.event.*;
 
import javax.swing.*;
 
 
 
public class PrimeNumber extends JFrame {
 
 private JTextField num2;
 
 private JTextArea Answer;
 
 private JButton fndPrimes;
 
 private PrimeButtonHandler btnHandler = new PrimeButtonHandler();
 private JTextField num1;
 private JLabel primeanswer;
 
  
 
 public PrimeNumber()
 
 {
 
  num2 = new JTextField( 5 );
  num2.setBounds(228, 115, 137, 30);
 
  Answer = new JTextArea(null,1,10); 
  Answer.setBounds(218, 254, 238, 70);
 
  Answer.setLineWrap(true);
 
  Answer.setWrapStyleWord(true);
 
  fndPrimes = new JButton("Find Primes");
  fndPrimes.setBounds(153, 3, 117, 42);
 
  fndPrimes.addActionListener(btnHandler);
 
  setVisible(true);
 
  setSize(600,400);
  getContentPane().setLayout(null);
 
  getContentPane().add(num2);
 
  getContentPane().add(Answer);
 
  getContentPane().add(fndPrimes);
  
  JLabel secondnum = new JLabel("Enter integer larger than the first:");
  secondnum.setBounds(10, 123, 197, 14);
  getContentPane().add(secondnum);
  
  JLabel firstnum = new JLabel("Enter a positive number:");
  firstnum.setBounds(10, 56, 149, 14);
  getContentPane().add(firstnum);
  
  num1 = new JTextField();
  num1.setBounds(227, 53, 137, 30);
  getContentPane().add(num1);
  num1.setColumns(10);
  
  primeanswer = new JLabel("The prime numbers are:");
  primeanswer.setBounds(10, 267, 175, 57);
  getContentPane().add(primeanswer);
 
   
 
 }
 
  
 
 public static boolean isPrime(int n) {
 
    
 
    if (n%2==0) return false;
 
   
 
    for(int i=3;i*i<=n;i+=2) {
 
        if(n%i==0)
 
            return false;
 
    }
 
    return true;
 
 }
 
     
 
 public static void main ( String[] args ) {
 
   PrimeNumber frm = new PrimeNumber();
 
   frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
  }
 
  
 
  private class PrimeButtonHandler implements ActionListener {
 
   public void actionPerformed(ActionEvent e) {
	 int number1 = Integer.parseInt(num1.getText());
     int number = Integer.parseInt(num2.getText());
 
     for (; number1 < number; number1++) {
 
     if (isPrime(number1))
 
       if (Answer.getText().equals(""))
 
             Answer.setText("" + number1);
 
        else Answer.setText(Answer.getText() + "," + number1);
 
     }
 
   }
 
  }
}

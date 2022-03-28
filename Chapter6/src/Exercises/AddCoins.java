/*
 
Program:.java          Last Date of this Revision: February 24, 2022
 
Purpose:
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Exercises;

 
import java.awt.EventQueue;
 
 
import javax.swing.JFrame;
 
import javax.swing.JButton;
 
import javax.swing.JLabel;
import java.awt.event.ActionListener;
 
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
 
 
public class AddCoins {
 
private JFrame frame;
private JTextField TotalCoins;
 
/**
 * Launch the application.
 */
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
AddCoins window = new AddCoins();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
 
/**
 * Create the application.
 */
public AddCoins() {
initialize();
}
 
/**
 * Initialize the contents of the frame.
 */
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
 
JButton Enter = new JButton("Enter");
 
 
Enter.setBounds(290, 21, 123, 55);
frame.getContentPane().add(Enter);
 
JLabel LabelQ = new JLabel("Quarters:");
LabelQ.setBounds(10, 85, 113, 25);
frame.getContentPane().add(LabelQ);
 
 
 
 
 
 
 
 
JLabel LabelD = new JLabel("Dimes:");
LabelD.setBounds(10, 121, 79, 25);
frame.getContentPane().add(LabelD);
 
JLabel LabelN = new JLabel("Nickels:");
LabelN.setBounds(10, 157, 69, 29);
frame.getContentPane().add(LabelN);
 
JLabel LabelP = new JLabel("Pennies:");
LabelP.setBounds(10, 197, 69, 29);
frame.getContentPane().add(LabelP);
 
TotalCoins = new JTextField();
TotalCoins.setBounds(171, 20, 76, 25);
frame.getContentPane().add(TotalCoins);
TotalCoins.setColumns(10);
 
JLabel LabelT = new JLabel("Enter your total coins:");
LabelT.setBounds(10, 11, 143, 42);
frame.getContentPane().add(LabelT);
 
  JLabel Quarters = new JLabel("");
Quarters.setBounds(171, 91, 76, 21);
frame.getContentPane().add(Quarters);
 
JLabel Dimes = new JLabel("");
Dimes.setBounds(171, 118, 76, 28);
frame.getContentPane().add(Dimes);
 
JLabel Nickels = new JLabel("");
Nickels.setBounds(171, 157, 76, 21);
frame.getContentPane().add(Nickels);
 
JLabel Pennies = new JLabel("");
Pennies.setBounds(171, 197, 76, 31);
frame.getContentPane().add(Pennies);
 
Enter.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) 
{
 
 
String num= TotalCoins.getText();
 
        int numT1 = Integer.valueOf(num);
        Integer Q = numT1 / 25;
        Integer D = (numT1%25)/10;
        Integer N = ((numT1%25)%10)/5;
        Integer P = numT1%5;
        
        
        
        Quarters.setText(Q.toString());
        Dimes.setText(D.toString());
        Nickels.setText(N.toString());
        Pennies.setText(P.toString());
        
 
        
        
        
 
 
 
};
});
 
}
 
protected static int getInput(String string) {
// TODO Auto-generated method stub
return 0;
}
}

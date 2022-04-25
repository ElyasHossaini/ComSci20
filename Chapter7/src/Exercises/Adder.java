/*
 
Program:.java          Last Date of this Revision: April 25, 2022
 
Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to make a selection.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Exercises;
 
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
 
public class Adder extends JFrame {
 
private JPanel contentPane;
private JTextField answerT;
 
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Adder frame = new Adder();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
 
/**
* Create the frame.
*/
public Adder() {
	setBackground(Color.DARK_GRAY);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 576, 300);
contentPane = new JPanel();
contentPane.setBackground(Color.DARK_GRAY);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
 
JTextArea instructions = new JTextArea();
instructions.setBackground(Color.DARK_GRAY);
instructions.setForeground(Color.WHITE);
instructions.setText("Answer the following questions. You have 3 tries for each question. \r\nIf you answer correctly on the first attempt, you get 5 points. \r\nIf your second attempt is correct you get 3 points \r\nIf your third attempt is correct you get 1 point. \r\nClick submit to begin game. \r\nEnter 999 as an answer to quit the game at any time.");
instructions.setBounds(10, 32, 540, 125);
contentPane.add(instructions);
 
JLabel title = new JLabel("Instructions: ");
title.setHorizontalAlignment(SwingConstants.CENTER);
title.setFont(new Font("Tahoma", Font.PLAIN, 16));
title.setForeground(Color.WHITE);
title.setBounds(210, 11, 118, 14);
contentPane.add(title);
 
JLabel quit = new JLabel("");
quit.setForeground(Color.WHITE);
quit.setBounds(10, 131, 308, 14);
contentPane.add(quit);
 
JTextArea question = new JTextArea();
question.setEditable(false);
question.setLineWrap(true);
question.setBounds(29, 191, 89, 22);
contentPane.add(question);
 
answerT = new JTextField();
answerT.setBounds(160, 190, 89, 23);
contentPane.add(answerT);
answerT.setColumns(10);
 
JTextArea display = new JTextArea();
display.setBounds(284, 191, 243, 22);
contentPane.add(display);
 
Player_Adder a = new Player_Adder();
Game_Adder b = new Game_Adder();
 
question.setText(b.showProblem());
 
 
JButton submit = new JButton("Enter");
submit.setBackground(Color.WHITE);
submit.setForeground(Color.DARK_GRAY);
submit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
int score = a.getScore();
 
final int SENTINEL = 999;
 
int playerAnswer = Integer.parseInt(answerT.getText());
 
 
playerAnswer = Integer.parseInt(answerT.getText());
 
if (playerAnswer != SENTINEL)
{
if (playerAnswer != b.getAnswer() && b.numAttempts() <= 3)
{
display.setText("Wrong answer. Enter another answer.");
 
playerAnswer = Integer.parseInt(answerT.getText());
 
a.updateScore(b.answerProblem(playerAnswer));
 
}
 
else
{a.updateScore(b.answerProblem(playerAnswer));
question.setText(b.showProblem());
 
playerAnswer = Integer.parseInt(answerT.getText());
 
 
score = a.getScore();
 
display.setText("Your score is: " + score);
}
}
 
else
{
score = a.getScore();
 
display.setText("Your final score is: " + score);
 
}
 
 
}
 
 
});
submit.setBounds(229, 225, 89, 23);
contentPane.add(submit);
 
 
}
}

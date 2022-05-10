/*
 
Program:.java          Last Date of this Revision: May 10, 2022
 
Purpose: Modify the DiceRoll application to roll 3 dices
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.lang.Math;

public class DIceRolls {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DIceRolls window = new DIceRolls();
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
	public DIceRolls() {
		initialize();
	
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton outcome = new JButton("Click to roll dice");
		outcome.setBounds(51, 99, 132, 111);
		outcome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == outcome) {
					int[] outcomes = new int[19]; //declares array
					int numRolls;//creates numRolls int
					int outcome;//create outcome int
					numRolls = Integer.parseInt(textField_2.getText()); //records user number
		
					
					for(int roll = 0; roll < numRolls; roll++) //for loop that finds and stores the element index
					{	
						outcome = (int)(6*Math.random() + 1) + (int)(6*Math.random() + 1) + (int)(6*Math.random());
						outcomes[outcome] += 1;
					}
					for(int i = 3; i <= 18; i++) 
					{	
						textField.setText(textField.getText() + i + ":" + outcomes[i] + " "); //display the dice rolls
					}
					
				}
					
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(outcome);
		
		textField = new JTextField();
		textField.setBounds(0, 210, 434, 51);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Close application");
		btnNewButton_1.setBounds(243, 99, 132, 111);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel numrolls = new JLabel("1.Please enter number of dice rolls: ");
		numrolls.setBounds(10, 11, 225, 27);
		frame.getContentPane().add(numrolls);
		
		JLabel lblNewLabel_1 = new JLabel("2.After you enter the number, please click the roll dice button.");
		lblNewLabel_1.setBounds(10, 37, 352, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("3.Click roll dice button to roll again if you want.");
		lblNewLabel_2.setBounds(10, 64, 282, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(224, 11, 151, 27);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}


	
	
	




}
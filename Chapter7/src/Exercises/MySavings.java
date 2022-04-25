/*
 
Program:.java          Last Date of this Revision: April 25, 2022
 
Purpose: The Adder game prompts a player for the answer to an addition problem.
 
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
public class MySavings extends JFrame {
 
	private JPanel contentPane;
	
	public JLabel TotalPrint = new JLabel("");
	MySavings2 savings = new MySavings2();
	JTextField a = new JTextField();
	JTextField A;
	JLabel WL = new JLabel();
	JButton Submit = new JButton("Submit");
	
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySavings frame = new MySavings();
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
	public MySavings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton A2 = new JButton("Add a penny\r\n");
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				savings.setSavings(0.01);
				A.setVisible(false);
				WL.setVisible(false);
				Submit.setVisible(false);
				TotalPrint.setVisible(true);
				TotalPrint.setText(savings.toString());
			}
		});
		A2.setBounds(110, 60, 135, 23);
		contentPane.add(A2);
		
		
	
		Submit.setBounds(318, 78, 89, 23);
		contentPane.add(Submit);
		
		JButton Quit = new JButton("Quit");
		Quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Quit.setBounds(318, 126, 89, 23);
		contentPane.add(Quit);
		
		JButton A5 = new JButton("Add quarter");
		A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				savings.setSavings(0.25);
				A.setVisible(false);
				WL.setVisible(false);
				Submit.setVisible(false);
				TotalPrint.setVisible(true);
				TotalPrint.setText(savings.toString());
			}
		});
		A5.setBounds(104, 162, 152, 23);
		contentPane.add(A5);
		
		JButton A4 = new JButton("Add dime");
		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				savings.setSavings(0.10);
				A.setVisible(false);
				WL.setVisible(false);
				Submit.setVisible(false);
				TotalPrint.setVisible(true);
				TotalPrint.setText(savings.toString());
			}
		});
		A4.setBounds(128, 126, 89, 23);
		contentPane.add(A4);
		
		JButton A3 = new JButton("Add nickel");
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				savings.setSavings(0.05);
				A.setVisible(false);
				WL.setVisible(false);
				Submit.setVisible(false);
				TotalPrint.setVisible(true);
				TotalPrint.setText(savings.toString());
			}
		});
		A3.setBounds(128, 94, 89, 23);
		contentPane.add(A3);
		
		JLabel Title = new JLabel("My Savings");
		Title.setBounds(110, 11, 183, 14);
		contentPane.add(Title);
		
		
		TotalPrint.setBounds(229, 222, 178, 14);
		contentPane.add(TotalPrint);
		
		A = new JTextField();
		A.setBounds(142, 216, 86, 20);
		contentPane.add(A);
		A.setColumns(10);
		
		
		WL.setText("How much money would you like to take out?");
		WL.setVisible(false);
		WL.setBounds(42, 35, 281, 23);
		contentPane.add(WL);
		
		JButton A1 = new JButton("Show total in bank");
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A.setVisible(false);
				WL.setVisible(false);
				Submit.setVisible(false);
				TotalPrint.setVisible(true);
				TotalPrint.setText(savings.toString());
				
			}
			
		});
		A1.setBounds(281, 162, 143, 23);
		contentPane.add(A1);
		
		JButton A6 = new JButton("Take money out of the bank");
		A6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A.setVisible(true);
				WL.setVisible(true);
				Submit.setVisible(true);
				TotalPrint.setVisible(false);
				
			}
		});
		A6.setBounds(10, 113, 89, 23);
		contentPane.add(A6);
		
		
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String B = A.getText();
				double BD = Double.parseDouble(B);
				savings.setSave(BD);
			}
		});
		
		Submit.setVisible(false);
		
		
		
		
		
		
	}

 
public class MySavings2 {
 
	 
		
		Double Savings2;
		
		public MySavings2() {
			Savings2 = 0.0;
		}
		
		public double getSavings() {
			return(Savings2);
		}
		
		public void setSavings(double Save) {
			Savings2 = Savings2 + Save;
		}
		
		public void setSave(double S) {
			Savings2 = Savings2 - S;
			
			
		}
		
		public String toString() {
			String SSavings;
			
			SSavings = ("You have $" + Savings2 + " in your account");
			return(SSavings);
		} 
 
	
}
	
}
 



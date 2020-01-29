/*
Tran, Kenny 
CS A170
February 23, 2018 

IC07_HackerChallenge
*/

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HackerChallenge extends JFrame
{

	public static void main(String[] args) 
	{
		message1();
	}
	
	public static void message1 () 
	{
		int choice;
		choice = JOptionPane.showConfirmDialog(null, "Are you 21 years of age or older?", "Age Verification", JOptionPane.YES_NO_OPTION);
		
		switch (choice)
		{
		case JOptionPane.YES_OPTION:
			 JOptionPane.showMessageDialog(null, "Proceed on, adult!", "You are an Adult", JOptionPane.INFORMATION_MESSAGE);
		break;
		
		case JOptionPane.NO_OPTION:
		JOptionPane.showMessageDialog(null, "You shall not pass!", "Minor Detected", JOptionPane.ERROR_MESSAGE );
		
		break;
		case JOptionPane.DEFAULT_OPTION:
			JOptionPane.showMessageDialog(null, "You must answer the question.", "Aversion Detected", JOptionPane.ERROR_MESSAGE );
			if (choice == JOptionPane.DEFAULT_OPTION)
			{
			 message2();
			}
		break;
		}
	}
	public static void message2 ()
	{
		int choice;
		choice = JOptionPane.showConfirmDialog(null, "Are you 21 years of age or older?", "Age Verification", JOptionPane.YES_NO_OPTION);
		
		switch (choice)
		{
		case JOptionPane.YES_OPTION:
			 JOptionPane.showMessageDialog(null, "Proceed on, adult!", "You are an Adult", JOptionPane.INFORMATION_MESSAGE);
		break;
		
		case JOptionPane.NO_OPTION:
		JOptionPane.showMessageDialog(null, "You shall not pass!", "Minor Detected", JOptionPane.ERROR_MESSAGE );
		break;
		
		case JOptionPane.DEFAULT_OPTION:
			 JOptionPane.showMessageDialog(null, "You must answer the question.", "Aversion Dected", JOptionPane.ERROR_MESSAGE );
			 if (choice == JOptionPane.DEFAULT_OPTION)
			 {
				 message1();
			 }
			 break;
		}
	}
	
	
}		



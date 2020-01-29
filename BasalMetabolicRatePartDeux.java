/*
Tran, Kenny 
CS A170
February 24, 2018 

IC06_BasalMetabolicRatePartDeux
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class BasalMetabolicRatePartDeux {

	public static void main(String[] args) {

		double weight, height, age, BMR, bar; 
		String gender;
		int activity;
		
		Scanner consoleScanner = new Scanner(System.in);
		DecimalFormat noDPs = new DecimalFormat("0");
		DecimalFormat oneDP = new DecimalFormat("0.0");
		
	
		System.out.println("Enter weight in pounds: ");
		weight = consoleScanner.nextDouble();
		System.out.println("Enter height in inches: ");
		height = consoleScanner.nextDouble();
		System.out.println("Enter age in years: ");
		age = consoleScanner.nextDouble();
		
		System.out.println("Please enter Male or Female");
		gender = consoleScanner.next().toUpperCase();
		
		System.out.println("Please enter the number corresponding with your activity factor: " 
							+ "\n1. Sedentary (not active)"
							+ "\n2. Somewhat active (exercise occasionally)"
							+ "\n3. Active (exercise 3-4 times per week)"
							+ "\n4. Highly Active (exercise every day)");
		activity = consoleScanner.nextInt();
		
		consoleScanner.close();
		
		if (gender.startsWith("F"))
		{
			BMR = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
		}
		else
		{
			BMR = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
		}
		
		if ( activity == 1) //sedentary
		{
			BMR *= 1.2;
		}
		else if ( activity == 2) // somewhat active
		{
			BMR *= 1.3;
		}
		else if ( activity ==3 ) // active
		{
			BMR *= 1.4; 
		}
		else // highly active
		{
			BMR *= 1.5;
		}
		
		bar = BMR/230;
				
		System.out.println("As a " + gender + " your BMR x Activity Factor is " + noDPs.format(BMR) 
		+ " and you need to eat " + oneDP.format(bar) + " chocolate bars \nto maintain this amount of calories.");
		
		

	
		
		
		
		
		
		
		
		

	}

}

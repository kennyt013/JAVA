package edu.orangecoastcollege.cs170.ktran516.ic18;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class LATemps {
	public static final int SIZE = 31;
	public static void main(String[] args) 
	{
		Scanner consoleScanner = new Scanner (System.in);
		int[] temps = new int[SIZE];
		double sum = 0;
		int largest;
		double average;
		int[] freqs;
		int maxfreq = 0;
		int mode = 0;
		DecimalFormat two = new DecimalFormat("00");
			
		for(int i = 0; i < SIZE ; i++)
		{
			System.out.print("Please enter daily high for October " + two.format(i+1) + ": " );
			temps[i] = consoleScanner.nextInt();
			sum+=temps[i];
			
		}
		consoleScanner.close();
		average = sum/SIZE;
		Arrays.sort(temps);
		largest = temps[SIZE-1];
		
		
		
		freqs = new int [largest+1];
		
		for ( int temp : temps)
		{
			freqs[temp]++;
			
		}
		
		for (int i = 0; i < freqs.length ; i++)
		{
			if (freqs[i] > maxfreq)
			{
				maxfreq = freqs[i];
				mode = i;
			}
	
		}
		
		
		System.out.println("\nOctober's highest daily temperature was: " + largest);
		System.out.println("October's average high temperature was: " + average);
		System.out.println("October's most frequent temperature was: " + mode);

	}

}

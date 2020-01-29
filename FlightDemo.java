/*
Tran, Kenny 
CS A170
April 3, 2018

IC14_Flight
*/
package edu.orangecoastcollege.cs170.ktran516.ic14;

public class FlightDemo {

	public static void main(String[] args) {
		Flight flight1 = new Flight("Hawaiian", 1, 5.5, PlaneType.AIRBUS_320, 100);
		Flight flight2 = new Flight(flight1);
		
		System.out.println(flight1);
		System.out.println(flight2);
		
		if (flight1.equals(flight2))
		{
			System.out.println("Both flights are the same.\n");
		}
		else
		{
			System.out.println("The flights are different.\n");
		}
		
		flight2.setCarrier("Delta");
		flight2.setNumber(1284);
		flight2.setDuration(6.0);
		flight2.setPlaneType(PlaneType.BOEING_737);
		
		System.out.println(flight1);
		System.out.println(flight2);
		
		if (flight1.equals(flight2))
		{
			System.out.println("Both flights are the same.\n");
		}
		else
		{
			System.out.println("The flights are different.\n");
		}
		System.out.println("~~~~~Adding 100 Passengers to both Flights~~~~~");
		
		flight1.addPassengers(100);
		flight2.addPassengers(100);
		
		System.out.println(flight1);
		System.out.println(flight2);
		
		System.out.println("\n~~~~~Removing 200 Passengers to both Flights~~~~~");
		flight1.removePassengers(200);
		flight2.removePassengers(200);
		
		System.out.println(flight1);
		System.out.println(flight2);
		
	}


	}



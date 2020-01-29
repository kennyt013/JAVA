/*
Tran, Kenny 
CS A170
April 3, 2018

IC14_Flight
*/
package edu.orangecoastcollege.cs170.ktran516.ic14;

public class Flight
{
	
		private String mCarrier;
		private int mNumber;
		private double mDuration;
		private PlaneType mPlaneType;
		private int mPassengers;
		
		public Flight(String Carrier, int Number, double Duration, PlaneType PlaneType, int Passengers)
		{
			mCarrier = Carrier;
			mNumber = Number;
			mDuration = Duration;
			mPlaneType = PlaneType;
			mPassengers = Passengers;
		}
		public String getCarrier()
		{
			return mCarrier;
		}
		public int getNumber()
		{
			return mNumber;
		}
		public double getDuration()
		{
			return mDuration;
		}
		public PlaneType getPlaneType()
		{
			return mPlaneType;
		}
		public int getPassengers()
		{
			return mPassengers;
		}
		
		public void setCarrier(String newCarrier)
		{
			mCarrier = newCarrier;
		}
		public void setNumber(int newNumber)
		{
			mNumber = newNumber;
		}
		public void setDuration( double newDuration)
		{
			mDuration = newDuration;
		}
		public void setPlaneType(PlaneType newPlaneType)
		{
			mPlaneType = newPlaneType;
		}
		
		public String toString()
		{
			String output = "Flight [Carrier = " + mCarrier + ", Number = " + mNumber + ", Duration = " + mDuration + ", PlaneType = " + mPlaneType + ", Passengers = " + mPassengers + "]";
			return output;
		}
		
		public boolean equals(Flight other)
		{
			if (mCarrier.equals(other.mCarrier) && mNumber == other.mNumber && mDuration == other.mDuration && mPlaneType == other.mPlaneType && mPassengers == other.mPassengers)
			{
				return true;
			}
			else
				return false;
		}
		
		public boolean addPassengers(int amount)
		{
			if (mPlaneType == PlaneType.AIRBUS_320 && mPassengers + amount <= 150)
			{
				mPassengers += amount;
				return true;
			}
			else if (mPlaneType == PlaneType.BOEING_737 && mPassengers + amount <= 200)
			{
				mPassengers += amount;
				return true;
			}
			else
				return false;
		}
		public boolean removePassengers(int amount)
		{
			if (mPassengers - amount >= 0)
			{
				mPassengers -= amount;
				return true;
			}
			else 
				return false;
		}
		

		public Flight(Flight other)
		{
			mCarrier = other.mCarrier;
			mNumber = other.mNumber;
			mDuration = other.mDuration;
			mPlaneType = other.mPlaneType;
			mPassengers = other.mPassengers;
		}
		

		

	}	



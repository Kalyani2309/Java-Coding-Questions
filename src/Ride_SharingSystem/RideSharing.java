package Ride_SharingSystem;

import java.util.Scanner;

public class RideSharing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Distance you want to travel : ");
		double distance = sc.nextDouble();

		System.out.println("\nChoose Vehicle (Car/Bike): ");
		String vehicleType = sc.next().toLowerCase();

		Vehicle vehicle = null;
		
		if (vehicleType.equals("car"))
		{
			vehicle = new Car();
			double fare = vehicle.calculateFare(distance);
			System.out.println("\nTotal fare for travelling " + distance + " km with " + vehicleType + " will be : " + fare);
		} 
		else if (vehicleType.equals("bike")) 
		{
			vehicle = new Bike();
			double fare = vehicle.calculateFare(distance);
			System.out.println("\nTotal fare for travelling " + distance + " km with " + vehicleType + " will be : " + fare);
		} 
		else 
		{
			System.out.println("User entered vehicle type not valid!");
		}

	}

}

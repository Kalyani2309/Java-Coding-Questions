package Car_RentalSystem;

import java.util.Scanner;

public class RentalSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Days: ");
		int days = sc.nextInt();
		
		System.out.println("\nEnter Vehicle Type(Car/Bike): ");
		String vehicleType = sc.next().toLowerCase();
		
		if(vehicleType.equals("car"))
		{
			CarRental car = new CarRental();
			int fare = car.calculateRentalPrice(days);
			System.out.println("\nRental prices:" +fare);
		}
		else if(vehicleType.equals("bike")) 
		{
			BikeRental bike = new BikeRental();
			int fare = bike.calculateRentalPrice(days);
			System.out.println("\nRental prices:" +fare);
		}
		else
		{
			System.out.println("\nUser Entered vehicle is not valid!");
		}
		
		
	}

}

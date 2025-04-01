package Ride_SharingSystem;

public class Bike implements Vehicle {

	//Method Override --> runtime polymorphism
	@Override
	public double calculateFare(double distance) {
		return 5 * distance;
	}

}









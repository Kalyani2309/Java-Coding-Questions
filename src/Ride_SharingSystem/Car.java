package Ride_SharingSystem;

public class Car implements Vehicle{

	@Override
	public double calculateFare(double distance) {
		return 10 * distance;
	}
}

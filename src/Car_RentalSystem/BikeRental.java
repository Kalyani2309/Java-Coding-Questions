package Car_RentalSystem;

public class BikeRental implements RentalService {

	@Override
	public int calculateRentalPrice(int days) {
		
		return 1000 * days;
	}

}

package Car_RentalSystem;

public class CarRental implements RentalService {

	@Override
	public int calculateRentalPrice(int days) {
		
		return 3000 * days;
	}

}

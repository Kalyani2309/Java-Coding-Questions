package Smart_HomeAutomation;

public class Fan extends Appliance{

	@Override
	void turnON() {
		System.out.println("Fan is turning on.");
		
	}

	@Override
	void turnOFF() {
		System.out.println("Fan is turning off.");
		
	}

}

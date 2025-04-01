package Smart_HomeAutomation;

public class SmartHomeAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fan f = new Fan();
		System.out.println("Fan");
		f.turnON();
		f.turnOFF();
		
		
		
		Light l = new Light();
		System.out.println("\nLight");
		l.turnON();
		l.turnOFF();	
	}
}



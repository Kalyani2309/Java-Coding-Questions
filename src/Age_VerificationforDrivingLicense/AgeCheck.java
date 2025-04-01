package Age_VerificationforDrivingLicense;

import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age : ");
		int age = sc.nextInt();

		try 
		{
			if (age < 18)
			{
				throw new InvalidAgeException("You must be 18 or older to apply for a driving license.");
			}
			System.out.println("Valid age or driving license!!!");
		} 
		catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
	}
}

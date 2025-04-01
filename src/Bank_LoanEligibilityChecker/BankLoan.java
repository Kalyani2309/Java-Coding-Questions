package Bank_LoanEligibilityChecker;

import java.util.Scanner;

public class BankLoan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();

		System.out.println("Enter Monthly Income: ");
		double income = sc.nextDouble();

		System.out.println("Enter Credit Score: ");
		double creditScore = sc.nextDouble();

		if (age < 21) {
			System.out.println("Not Eligible : Age is less than 21");
		} else if (income < 20000) {
			System.out.println("Not Eligible : Income is less than 20000");
		} else if (creditScore < 650) {
			System.out.println("Eligible : Low-Interest Loan");
		} else {
			System.out.println("Eligible : Standard Loan");
		}
	}

}

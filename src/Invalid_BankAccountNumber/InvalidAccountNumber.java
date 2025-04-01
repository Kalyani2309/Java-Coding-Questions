package Invalid_BankAccountNumber;

import java.util.Scanner;

public class InvalidAccountNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 6 Digit Account Number: ");
		String AccountNumber = sc.next();
		
		try {
			if(AccountNumber.length() != 6) 
			{
				throw new InvalidAccountNumberException("Please enter a valid 6-digit account number.");
			}
			System.out.println("Valid Account Number");
		}
		catch(InvalidAccountNumberException e)
		{
			System.err.println(e.getMessage());
		}
	}

}

package Division_Calculator;

import java.util.Scanner;

public class HandleZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numerator number : ");
		int numerator = sc.nextInt();
		
		System.out.println("\nEnter Denominator number : ");
		int denominator = sc.nextInt();
		
		try {
			if(denominator == 0) {
				throw new ArithmeticException("\nDivision by zero is not allowed");
			}
			int result =  numerator / denominator;
			System.out.println("\nResult : " + result);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}
}

package OnlineShopping_ProductAvailability;

import java.util.Scanner;

public class ProductAvailability {

	public static void main(String[] args) {
		
		String[] product = {"Laptop","Phone", "Tablet", "Watch", "Headphones"};
		
		Scanner sc = new Scanner(System.in);
		
		

		try 
		{
			System.out.println("Enter product index (0-4): ");
			int index = sc.nextInt();
			System.out.println("Product at index " +index+ " : " +product[index]);
		}
		catch(Exception e)
		{
			System.err.println("Product Not Found");
		}
	}

}

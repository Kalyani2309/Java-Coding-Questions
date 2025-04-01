package Online_ShoppingCartSystem;

import java.util.Scanner;

public class Cart {
	
	Scanner sc = new Scanner(System.in);
	Product[] items = new Product[10];
	int count = 0;
	
	
	void addItems(Product p) 
	{
		if(count < 10)
		{
			items[count++] = p;
			
			System.out.println(p.name + " Added");
		} 
		else 
		{
			System.out.println("Cart Full");
		}
	}
	
	void removeItems(int productId) 
	{
		for(int i = 0;i<count;i++)
		{
			if(items[i].productId == productId)
			{
				items[i] = items[--count];
				items[count] = null;
				System.out.println("Item Removed");
				return;
			} 
		}
		System.out.println("Item not Found");
	}
	
	
	double total()
	{
		double sum = 0;
		for(int i= 0;i<count;i++)sum += items[i].price;
		return sum;
	}
	
	void display() {
		if(count == 0)
		{
			System.out.println("Cart empty");
			return;
		}
		for(int i = 0;i<count;i++)
		{
			
			System.out.println(items[i].name+ +items[i].price);
			System.out.println("Total: " +total());
		}
	}
}

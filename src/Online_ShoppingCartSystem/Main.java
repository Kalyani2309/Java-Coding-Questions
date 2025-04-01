package Online_ShoppingCartSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cart c = new Cart();
		c.addItems(new Product(1,"Laptop",75000));
		c.addItems(new Product(2,"Mouse",12000));
		c.addItems(new Product(3,"Keybord",12000));
		c.display();
		c.removeItems(2);
		c.display();
		c.removeItems(4);

	}

}


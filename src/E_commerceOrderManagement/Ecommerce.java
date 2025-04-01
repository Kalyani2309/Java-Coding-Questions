package E_commerceOrderManagement;

public class Ecommerce {
	public static void main(String[] args) {
		
		Order o = new Order();
		o.setOrderID(1);
		o.setCustomerName("Kalyani");
		o.setOrderAmount(50000);
		
		//Place Order
		o.placeOrder();
		
		//Display Order
		o.display();
		
		//Apply Discount
		o.discount();
		
	}
}

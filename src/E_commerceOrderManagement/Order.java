package E_commerceOrderManagement;

public class Order {

	private int orderID;
	private String customerName;
	private double orderAmount;

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public void display() {
		System.out.println("\nOrder Details:");
		System.out.println("Order ID : " + orderID + " " + "\nCustomer Name : " + customerName + " "+ "\nOrder Amount : " + orderAmount);
	}

	public void placeOrder() {
		System.out.println("Order Placed!!!");
	}

	public void discount() {
		if (orderAmount > 5000) {
			System.out.println("\nDiscount:");
			System.out.println("Amount after 10% discount : " + orderAmount * 0.9);
		} else {
			System.out.println("\nNo Discount:");
			System.out.println("Order amount is lesser than 5000.");
		}
	}
}
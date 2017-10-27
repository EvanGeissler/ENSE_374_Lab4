import java.util.ArrayList;

public class Order(){
	private Date dateReceived; 
	private double price;
	private int orderID;

	public ArrayList<OrderLine> orderLine = new ArrayList<OrderLine>();

	public Date getDateReceived(){
		return(dateReceived);
	}

	public double calculatePrice(){
		
		//Cycle through products
		price = product.getPrice() * orderL.getQuantity();
		
		price -= customer.getDiscountRating();

		return(price);
	}

}


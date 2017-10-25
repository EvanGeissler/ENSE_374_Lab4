class OrderLine(){
	int quantity;
	double price;

	void OrderLine(Product product, int quantity, double price);
	Product getProduct();
	int getQuantity();
	double getPrice();
}

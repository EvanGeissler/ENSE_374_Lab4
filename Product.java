purblic class Product(){
	private String name;
	private double price;
	private int productID; 
	
	public void setName(String n){
		name = n;
	}

	public void setPrice(double p){
		price = p;
	}

	public void setID(int ID){
		productID = ID;
	}

	public String getName(){
		return(name);
	}

	public double getPrice(){
		return(price);
	}

	public int getProductID(){
		return(prodcutID);
	}
}

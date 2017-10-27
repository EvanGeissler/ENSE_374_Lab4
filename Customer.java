public class Customer(){
	private	String name;
	private String address;
	private float creditRating;
	private float discountRating;

	public void setCreditRating(float credit){
		creditRating = credit;
	}

	public void setName(String name){
		name = name1;
	}

	public void setAddress(String address){
		address = address1;
	}

	public void setDiscount(float discount){
		discountRating = discount;
	}

	public float getCreditRating(){
		return(creditRating);
	}
	
	public String getName(){
		return(name);
	}

	public String getAddress(){
		return(address);
	}

	public float getDiscountRating(){
		return(discountRating);
	}

}

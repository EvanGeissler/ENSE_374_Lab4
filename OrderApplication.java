public class OrderApplication(){

	OrderApplication oa = new OrderApplication();

	Order order = new Order();

	oa.createOrder(order);

	public boolean createOrder(Order order){

		//Product tablet = new Product();
		//tablet.name = "Tablets"
		//order.addOrderItem(tablet, 5);

		order.

		cust.setName("Evan");
		cust.setAddress("University");
		cust.setDiscount(1.00);
		cust.setCredit(5.00);	

		return(true);
	}

	private boolean importCatalogue(){
		Product product = new Product(10);

		String fileName = "ProductCatalogue.txt";
		String line = null; 

		try{
			FileReader fileReader = new FileReader(fileReader); 

			BufferedReader bufferedReader = new Buffered(fileReader);

			while((line = bufferedReader.readLine()) != null){
				product.setName(line);
				product.setPrice(line);
				product.setQuantity(line);
			};

			bufferedReader.close();
		}

		catch(FileNotFoundException ex){
			System.out.println("Unable to open file " + fileName + " \n"); 
		}

		catch(IOException ex){
			Systm.out.println("Error reading file " + fileName + " \n");
		}

		return(true);
	}

}


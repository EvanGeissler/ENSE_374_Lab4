import java.util.Scanner;


public class userInput(){
	Scanner userIn = new Scanner(System.in); 

	System.out.print("What would you like to change about your order?\n");
	System.out.print("1. Change quantity\n");
	System.out.print("2. Delete order\n");
	System.out.print("3. Nothing\n");

	userOption = userIn.next();

	//Change what the user wants changed
	if("1".equals(userOption)){	//Change quantity 
		System.out.print("What should be the new quanitity: ");
		userOption = userIn.next();

		setQuantity(userOption);	//Send in new quantity 

	}else("2".equals(userOption)){
		//Delete item by setting everything to nul or 0, if linked list, delete node
	}


}



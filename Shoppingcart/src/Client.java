//import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Supermarket sm = new Supermarket();

		sm.AddProduct("TOMO", 2.37);
		sm.AddProduct("ONION", 4.66);
		sm.AddProduct("MEAT", 2.56);
		sm.AddProduct("MEAT", 2.56);
		sm.AddProduct("ppp", 2.59);
		sm.AddProduct("Bread", 3.00);
		sm.AddProduct("Coffe", 4.50);
		sm.AddProduct("Butter", 1.47);
		sm.AddProduct("Sugar", 0.30);
		sm.AddOffer("Bread 1/4", 75 ,"Bread");
		sm.AddOffer("Tomato at half", 30 ,"TOMO");
		sm.AddOffer("Sugar for free", 15 ,"Sugar");
		sm.AddOffer("Meat an offer", 20 ,"MEAT");
		sm.AddOffer("Butter for all", 60 ,"Butter");
		sm.AddOffer("Onion for your eyes", 75 ,"ONION");
		sm.listProducts();
		sm.SellProduct(2);
		sm.SellProduct(1);
		sm.SellProduct(2);
		sm.SellProduct(2);
		sm.SellProduct(2);
		sm.SellProduct(2);
		sm.SellProduct(2);
		sm.showList();
		sm.getTotal(2);
		sm.SellProduct(1);
		sm.SellProduct(5);
		sm.SellProduct(3);
		sm.showList();
		
	}
}

//import java.util.Scanner;

public class Client {
	public static void main(String[] args) {

		Supermarket sm = new Supermarket();

		sm.AddProduct("TOMO", 2.37, 1);
		sm.AddProduct("ONION", 4.66, 1);
		sm.AddProduct("MEAT", 2.56, 1);
		sm.AddProduct("MEAT", 2.56, 1);
		sm.AddProduct("ppp", 2.59, 2);
		sm.AddProduct("Bread", 3.00, 1);
		sm.AddProduct("Coffe", 4.50, 2);
		sm.AddProduct("Butter", 1.47, 1);
		sm.AddProduct("Mouse", 0.30, 3);
		sm.AddProduct("Soap", 0.30, 4);
		sm.AddProduct("HDMI cable", 0.30, 3);
		sm.AddProduct("ToothPaste", 0.30, 4);

		sm.AddOffer("Bread 1/4", 75, "Bread");
		sm.AddOffer("Tomato at half", 30, "TOMO");
		sm.AddOffer("Sugar for free", 15, "Sugar");
		sm.AddOffer("Meat an offer", 20, "MEAT");
		sm.AddOffer("Butter for all", 60, "Butter");
		sm.AddOffer("Onion for your eyes", 75, "ONION");

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

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Supermarket {
	private ArrayList<Item> ProductDB;
	private ArrayList<Offers> OfferDB;
	private ShoppingList ShL;
	private static int paymentcounter;
	private PaymentFactory paymentfactory;
	private ItemFactory itemfactory;
	private double cashdiscount;

	public Supermarket() {
		ProductDB = new ArrayList<Item>();
		OfferDB = new ArrayList<Offers>();
		ShL = new ShoppingList();
		paymentfactory = new PaymentFactory();
		paymentcounter = 0;
		cashdiscount = 10;
		itemfactory = new ItemFactory();
	}

	// Method that add products on the DB, only if are not added
	public void AddProduct(String name, double price, int x) {
		Item item = itemfactory.getItem(x);
		System.out.println("hola");
		item.SetItem(name, price);
		boolean exist = false;
		int ind = 0;
		for (int i = 0; i < ProductDB.size(); i++) {
			if (name.equals(ProductDB.get(i).getName())) {
				exist = true;
				ind = i;
				break;
			}
		}
		if (!exist) {
			ProductDB.add(item);
			System.out.println("A notification has been sent to the manager");
		} else {
			ProductDB.get(ind).counter();
		}
	}

	// Method that removes product on the DB
	public void RemProduct(String name) {
		for (int i = 0; i < ProductDB.size(); i++) {
			if (name == ProductDB.get(i).getName())
				ProductDB.remove(i);
		}
	}

	public void changePrice(String name, double newprice) {
		boolean exist = false;
		int ind = 0;
		for (int i = 0; i < ProductDB.size(); i++) {
			if (name.equals(ProductDB.get(i).getName())) {
				exist = true;
				ind = i;
				break;
			}
		}
		if (!exist) {
			ProductDB.get(ind).setItemPrice(newprice);
			System.out.println("A notification was sent to the manager");
		}
	}

	// Method that shows all the products in the DB
	public void listProducts() {
		System.out.println("SuperMarket stock");
		System.out.println("NAME" + "\t\tPRICE" + "\t\tSTOCK");
		for (int i = 0; i < ProductDB.size(); i++) {
			System.out.println((i + 1) + "." + ProductDB.get(i).getName()
					+ "\t\t$" + ProductDB.get(i).getPrice() + "\t\t   "
					+ ProductDB.get(i).getCounter());
		}
	}

	// Method to add a product to the shopping list
	public void SellProduct(int i) {
		ShL.BuyProduct(ProductDB.get(i - 1), ProductDB.get(i - 1).getType());
	}

	public void showList() {
		ShL.list();
		ShL.getoffer(OfferDB);
	}

	// Method that return the total, depending on how is payed, a discount is
	// apply
	// and come data is required
	public void getTotal(int x) {
		DecimalFormat decimal = new DecimalFormat("0.000");
		Payment p = paymentfactory.getPay(x);
		if (x == 1)
			p.pay(ShL.subtotal(), cashdiscount);
		if (x == 2)
			p.pay(ShL.subtotal(), ShL.getCheapest());
		if (x == 3)
			p.pay(ShL.subtotal(), ShL.getMexpensive());
		paymentcounter++;
		ShL = new ShoppingList();
		System.out.println("A notification was sent to the manager");
	}

	public void AddOffer(String offer, double price, String offeritem) {
		Offers off = new Offers();
		boolean exist = false;
		for (int i = 0; i < OfferDB.size(); i++) {
			if (offeritem.equals(OfferDB.get(i).getOfferItem())) {
				exist = true;
				break;
			}
		}
		if (!exist) {
			off.setOffer(offer);
			off.setOPrice(price);
			off.setOfferItem(offeritem);
			OfferDB.add(off);
			System.out.println("A notification was sent to the manager");
		}
	}

	public int listsize() {
		return ProductDB.size();
	}

}

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class ShoppingList {
	// Products contained on a shopping list
	private ArrayList<Item> ProductList;
	private double subtotal;
	private double cheapest;
	private double expensive;
	private ItemFactory itemfactory;

	// private Product prod;

	// Only constructor for ShoppingList class
	public ShoppingList() {
		ProductList = new ArrayList<Item>();
		itemfactory = new ItemFactory();
	}

	// Add product function,if it already exist, then increases the product
	// counter
	public void BuyProduct(Item product, int x) {
		Item pr = itemfactory.getItem(x);
		pr.setItemName(product.getName());
		pr.setItemPrice(product.getPrice());
		boolean exist = false;
		for (int i = 0; i < ProductList.size(); i++) {
			if (product.getName().equals(ProductList.get(i).getName())) {
				ProductList.get(i).counter();
				exist = true;
			}
		}
		if (!exist) {
			pr.setItemName(product.getName());
			pr.setItemPrice(product.getPrice());
			ProductList.add(pr);
		}
		subtotal = subtotal + product.getPrice();
	}

	// modificar el contador o eliminar producto //
	// Remove product function
	public void removeProdut(Cleaning product) {
		ProductList.remove(product);
		subtotal = subtotal - product.getPrice();
	}

	public void list() {
		DecimalFormat decimal = new DecimalFormat("0.000");
		System.out.println("\nShopping list detail");
		System.out.println("NAME" + "\t\tPRICE" + "\t\tQUANTITY\n");
		for (int i = 0; i < ProductList.size(); i++) {
			System.out.println(ProductList.get(i).toString());
		}
		System.out.println("SUBTOTAL" + "\t\t" + decimal.format(subtotal));
	}

	// Method to get the cheapest Item to apply a discount
	public double getCheapest() {
		double cheap;
		cheap = ProductList.get(0).getPrice();
		for (int i = 0; i < ProductList.size(); i++) {
			if (Double.compare(cheap, ProductList.get(i).getPrice()) > 0) {
				cheap = ProductList.get(i).getPrice();
			}
		}
		return cheap;
	}

	// Method to get the most expensive Item to apply a discount
	public double getMexpensive() {
		double expensive;
		expensive = ProductList.get(0).getPrice();
		for (int i = 0; i < ProductList.size(); i++) {
			if (Double.compare(expensive, ProductList.get(i).getPrice()) < 0) {
				expensive = ProductList.get(i).getPrice();
			}
		}
		return expensive * 0.9;
	}

	public double subtotal() {
		return subtotal;
	}

	public void getoffer(ArrayList<Offers> OfferDB) {
		DecimalFormat decimal = new DecimalFormat("0.000");
		cheapest = ProductList.get(0).getPrice();
		for (int j = 0; j < ProductList.size(); j++) {
			for (int i = 0; i < OfferDB.size(); i++) {
				if (OfferDB.get(i).getOfferItem()
						.equals(ProductList.get(j).getName())) {
					OfferDB.get(i).priceoffer(ProductList.get(j).getPrice());
					subtotal = subtotal
							- OfferDB.get(i).priceTOdiscount(
									ProductList.get(j).getPrice());
					break;
				}
			}
		}

		System.out.println("Subtotal whith offers discounts: $"
				+ decimal.format(subtotal));
	}
}

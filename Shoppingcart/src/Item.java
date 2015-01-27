import javax.print.attribute.standard.PrinterLocation;

public class Item {
	// Attributes of Product, productcounter is used for quantity in the list
	// and for stock in Supermarket
	private String itemname;
	private double itemprice;
	private int itemcounter;

	public Item() {
		itemcounter = 1;
	}

	public String getItemName() {
		return itemname;
	}

	public void setItemName(String itemname) {
		this.itemname = itemname;
	}

	public double getItemPrice() {
		return itemprice;
	}

	public void setItemPrice(double itemprice) {
		this.itemprice = itemprice;
	}

	public void counter() {
		++itemcounter;
	}

	public int getCounter() {
		return itemcounter;
	}

	public String toString() {
		return (itemname + "\t\t$ " + itemprice + "\t\t" + itemcounter);
	}
}

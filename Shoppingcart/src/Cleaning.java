import javax.print.attribute.standard.PrinterLocation;

public class Cleaning extends Item {
	// Attributes of Product, productcounter is used for quantity in the list
	// and for stock in Supermarket
	private String itemname;
	private double itemprice;
	private int itemcounter;

	public Cleaning() {
		itemcounter = 1;
	}

	@Override
	public void SetItem(String itemname, double itemprice) {
		this.itemname = itemname;
		this.itemprice = itemprice;
	}

	@Override
	public String getName() {
		return itemname;
	}

	@Override
	public void setItemName(String itemname) {
		this.itemname = itemname;
	}

	@Override
	public double getPrice() {
		return itemprice;
	}

	@Override
	public void setItemPrice(double itemprice) {
		this.itemprice = itemprice;
	}

	@Override
	public void counter() {
		itemcounter++;
	}

	@Override
	public int getCounter() {
		return itemcounter;
	}

	@Override
	public int getType() {
		return 4;
	}

	public String toString() {
		return (itemname + "\t\t$ " + itemprice + "\t\t" + itemcounter);
	}
}

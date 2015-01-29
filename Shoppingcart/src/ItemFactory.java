public class ItemFactory {
	public Item getItem(int x) {
		if (x == 1)
			return new Perishabel();
		if (x == 2)
			return new NonPerishable();
		if (x == 3)
			return new Electronics();
		if (x == 4)
			return new Cleaning();
		return null;
	}
}

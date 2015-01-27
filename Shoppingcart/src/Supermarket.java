import java.util.ArrayList;
import java.text.DecimalFormat;


public class Supermarket {
	private ArrayList<Item> ProductDB;
	private ArrayList<Offers> OfferDB;
	private ShoppingList ShL;
	private CreditCard creditcard;
	private Paypal paypal;
	private static int	paymentcounter;
	
	
	public Supermarket(){
		ProductDB=new ArrayList<Item>();
		OfferDB=new ArrayList<Offers>();
		ShL=new ShoppingList();
		creditcard= new CreditCard();
		paypal=new Paypal();
		paymentcounter=0;
	}
	


	// Method that add products on the DB, only if are not added
	public void AddProduct(String name,double price){
		Item buy=new Item();
		boolean exist=false;
		int ind=0;
		for(int i=0;i<ProductDB.size();i++){
			if(name.equals(ProductDB.get(i).getItemName())){
				exist=true;
				ind=i;
				break;
			}
		}
		if(!exist){
		buy.setItemName(name);
		buy.setItemPrice(price);
		ProductDB.add(buy);
		System.out.println("A notification was sent to the manager");
		}
		else{
			ProductDB.get(ind).counter();
		}
	}
	
	// Method that removes product on the DB
	public void RemProduct(String name){
		for(int i=0;i<ProductDB.size();i++){
			if(name==ProductDB.get(i).getItemName())
				ProductDB.remove(i);
				//exist=true;
		}
	}
	
	public void changePrice(String name,double newprice){
		boolean exist=false;
		int ind=0;
		for(int i=0;i<ProductDB.size();i++){
			if(name.equals(ProductDB.get(i).getItemName())){
				exist=true;
				ind=i;
				break;
			}
		}
		if(!exist){
		ProductDB.get(ind).setItemPrice(newprice);
		System.out.println("A notification was sent to the manager");
		}
	}
	
	// Method that shows all the products in the DB
	public void listProducts(){
		System.out.println("SuperMarket stock");
		System.out.println("NAME"+"\t\tPRICE"+"\t\tSTOCK");
		for(int i=0;i<ProductDB.size();i++){
		System.out.println((i+1)+"."+ProductDB.get(i).getItemName() + 
				"\t\t$" + ProductDB.get(i).getItemPrice() + 
				"\t\t   "+ProductDB.get(i).getCounter());
		}
		}
	
	// Method to add a product to the shopping list
	public void SellProduct(int i){
		ShL.BuyProduct(ProductDB.get(i-1));
	}
	
	public void showList(){
		ShL.list();
		ShL.getoffer(OfferDB);
	}
	
	// Method that return the total, depending on how is payed, a discount is apply
	// and come data is required
	public void getTotal(int x){
		DecimalFormat decimal=new DecimalFormat("0.000");
	switch(x){
		case 1:
			paypal.printTotal(ShL.subtotal(), ShL.getCheapest());
			paymentcounter++;
			ShL=new ShoppingList();
			System.out.println("A notification was sent to the manager");
			break;
		case 2:
			creditcard.getTotal(ShL.subtotal());
			paymentcounter++;
			ShL=new ShoppingList();
			System.out.println("A notification was sent to the manager");
			break;
		case 3:
			System.out.println("CASH PAYMENT");
			System.out.println("TOTAL TO PAY BY CASH: " 
			+ "\t$"+ decimal.format((ShL.subtotal() - ShL.getMexpensive())));
			paymentcounter++;
			ShL=new ShoppingList();
			System.out.println("A notification was sent to the manager");
			break;
	}
}
	
	public void AddOffer(String offer,double price,String offeritem){
		Offers off=new Offers();
		boolean exist=false;
		for(int i=0;i<OfferDB.size();i++){
			if(offeritem.equals(OfferDB.get(i).getOfferItem())){
				exist=true;
				break;
			}
		}
		if(!exist){
		off.setOffer(offer);
		off.setOPrice(price);
		off.setOfferItem(offeritem);
		OfferDB.add(off);
		System.out.println("A notification was sent to the manager");
		}
	}
	
	
	public int listsize(){
		return ProductDB.size();
	}
	
}



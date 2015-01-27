public class Offers {
	private String offerName;
	private String offerItem;
	private double offerDiscount;

	public Offers() {
	}

	public void setOffer(String offerName) {
		this.offerName = offerName;
	}

	public String getOffer() {
		return offerName;
	}

	public void setOPrice(double offerDiscount) {
		this.offerDiscount = offerDiscount;
	}

	public double getODiscount() {
		return offerDiscount;
	}
	public void setOfferItem(String offerItem){
		this.offerItem=offerItem;
	}
	
	public String getOfferItem(){
		return offerItem;
	}
	
	public double priceTOdiscount(double itemprice){
		return itemprice*offerDiscount*0.01;
	}
	public void priceoffer(double itemprice){
				System.out.println("\n" + offerName+ "\t $" + 
				(itemprice - (itemprice*offerDiscount*0.01))+
				"\n\t" + offerItem + "\t $ " + itemprice);
	}
}

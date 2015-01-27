import java.util.Scanner;
import java.text.DecimalFormat;


public class CreditCard {
	private String name;
	private int ccnumber;
	private Scanner sc=new Scanner(System.in);

	public CreditCard(){
	}
	
	public void setName(String name){
		this.name=name;
	}	
	
	public void setCCnumber(int ccnumber){
		this.ccnumber=ccnumber;
	}
	
	public void getTotal(double subtotal){
		DecimalFormat decimal=new DecimalFormat("0.000");
		System.out.println("CREDITCARD PAYMENT");
		System.out.println("Name: ");
		setName(sc.next());
		System.out.println("CREDITCARD NUMBER: ");
		setCCnumber(sc.nextInt());
		System.out.println("TOTAL TO PAY WITH CREDITCARD: " 
		+ "\t$"+ decimal.format(subtotal*0.9));
	}
}

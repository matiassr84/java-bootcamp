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
		boolean correct=true;
		int number=0;
		String compare;
		System.out.println("CREDITCARD PAYMENT");
		System.out.println("Name: ");
		setName(sc.next());
		do{
		correct=true;
		System.out.println("CREDITCARD NUMBER: ");
		compare=sc.next();
		for (int i = 0; i < compare.length(); i++) {
            if (Character.isDigit(compare.charAt(i))) {
            } else {
                correct = false;
                break;
            }
        } 
		if(correct){
			number= Integer.parseInt(compare);
			setCCnumber(number);
		}
		else
			System.out.println("Credit card number incorrect. Only numbers allowed");
			}while(!correct);
		System.out.println("TOTAL TO PAY WITH CREDITCARD: " 
		+ "\t$"+ decimal.format(subtotal*0.9));
	}
}

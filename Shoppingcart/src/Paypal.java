import java.util.Scanner;
import java.text.DecimalFormat;

public class Paypal {
	private String email;
	private String pass;
	private Scanner sc = new Scanner(System.in);

	public Paypal() {

	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void printTotal(double subtotal, double cheapest) {
		DecimalFormat decimal=new DecimalFormat("0.000");
		System.out.println("PAYPAL PAYMENT");
		System.out.println("Email: ");
		setemail(sc.next());
		System.out.println("Password: ");
		setPass(sc.next());
		System.out.println("TOTAL TO PAY WITH PAYPAL: " + "\t$"
				+ decimal.format(subtotal - cheapest));
	}
}

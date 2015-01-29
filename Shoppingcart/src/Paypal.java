import java.util.Scanner;
import java.text.DecimalFormat;

public class Paypal extends Payment {
	private String email;
	private String pass;

	public Paypal() {

	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public void pay(double subtotal, double discount) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.000");
		System.out.println("PAYPAL PAYMENT");
		System.out.println("Email: ");
		setemail(sc.next());
		System.out.println("Password: ");
		setPass(sc.next());
		System.out.println("TOTAL TO PAY WITH PAYPAL: " + "\t$"
				+ decimal.format(subtotal - discount));
	}
}

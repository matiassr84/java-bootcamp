import java.text.DecimalFormat;

public class Cash extends Payment {
	public Cash() {

	}

	@Override
	public void pay(double subtotal, double discount) {
		DecimalFormat decimal = new DecimalFormat("0.000");
		System.out.println("CASH PAYMENT");
		System.out.println("TOTAL TO PAY BY CASH: " + "\t$"
				+ decimal.format(subtotal));
		System.out.println(subtotal - discount);
	}
}

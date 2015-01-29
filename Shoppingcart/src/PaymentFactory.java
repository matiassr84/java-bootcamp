public class PaymentFactory {
	public Payment getPay(int i) {
		if (i == 1) {
			return new CreditCard();
		}
		if (i == 2) {
			return new Paypal();
		}
		if (i == 3) {
			return new Cash();
		}
		return null;
	}
}

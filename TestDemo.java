public class TestDemo {

	public static void main(String[] args) 
	{
	CreditCardPayment a = new CreditCardPayment(23.58, "John Doe","05/24", "************2968");

			CashPayment b = new CashPayment(18.25);

	CreditCardPayment c = new CreditCardPayment(38.29, "Jane Blane","02/27","************1966");

			CashPayment d = new CashPayment(69.27);
			
			a.paymentDetails();
			b.paymentDetails();
			c.paymentDetails();
			d.paymentDetails();
		}
}
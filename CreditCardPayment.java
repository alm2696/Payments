public class CreditCardPayment extends Payment{

	public String name, expDate, number;

	CreditCardPayment(double value, String name, String expDate, String number) 
	{
		super(value);
		this.number = number;
		this.expDate = expDate;
		this.name = name;
	}

	public void paymentDetails() {
	System.out.println("Payment of $" + this.cash + " through card " + this.number
        + ",  and expire date "	+ this.expDate + ", name on the card: " + this.name + ".");
	}
}
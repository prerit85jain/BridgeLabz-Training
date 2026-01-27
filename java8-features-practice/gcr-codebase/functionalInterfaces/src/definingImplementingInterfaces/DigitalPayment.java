package definingImplementingInterfaces;

interface Payment{
	void pay(double amount);
}

class UPI implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println(amount + " has bee paid by UPI");
	}
}

class CreditCard implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println(amount + " has bee paid by Credit Card");
	}
}

class Wallet implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println(amount + " has bee paid by Wallet");
	}
}

public class DigitalPayment {

	public static void main(String[] args) {
		Payment upi = new UPI();
		Payment card = new CreditCard();
		Payment wallet = new Wallet();
		
		upi.pay(5000);
		card.pay(4500);
		wallet.pay(5130);
		
	}

}

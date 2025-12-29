package level01;

class MobilePhone{
	private String brand;
	private String model;
	private double price;
	
	MobilePhone(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void mobileDetails() {
		System.out.println("Mobile Destals: ");
		System.out.println("Mobile Brand: "+ brand);
		System.out.println("Mobile Model: "+ model);
		System.out.println("Mobile price: "+ price);
		System.out.println("+----------------------------------+");
	}
}
public class MobilePhoneDetails {
	public static void main(String[] args) {
		MobilePhone mobile1 = new MobilePhone("Nothing", "2a", 22000);
		MobilePhone mobile2 = new MobilePhone("Vivo", "Vivo V29", 18000);
		
		mobile1.mobileDetails();
		mobile2.mobileDetails();
	}
}

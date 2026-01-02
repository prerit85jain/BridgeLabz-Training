package dynamicOnlineMarketplace;

public class Product<T> {
	
	private String name;
	private double price;
	private T catagory;
	
	Product(String name, double price, T catagory) {
		this.name = name;
		this.price = price;
		this.catagory = catagory;
	}
	
	public String getName() {return name;}
	public double getPrice() {return price;}
	public T getCatagory() {return catagory;}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product{ Name: "+ name + ", Price: "+ price + ", Catagory: "+ catagory +" }";
	}
}

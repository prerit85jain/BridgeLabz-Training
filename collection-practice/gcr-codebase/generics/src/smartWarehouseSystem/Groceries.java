package smartWarehouseSystem;

class Groceries extends WarehouseItem {
	private String expirationDate;
	
	public Groceries(String name, double price, String expirationDate) {
		super(name, price);
		this.expirationDate = expirationDate;
	}
	
	public String getExpirationDate() {
		return expirationDate;
	}
	
	@Override
	public String getCategory() {
		return "Groceries";
	}
}
package smartWarehouseSystem;

class Electronics extends WarehouseItem {
	private String brand;
	
	public Electronics(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	@Override
	public String getCategory() {
		return "Electronics";
	}
}
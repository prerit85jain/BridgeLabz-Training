package smartWarehouseSystem;

class Furniture extends WarehouseItem {
	private String material;
	
	public Furniture(String name, double price, String material) {
		super(name, price);
		this.material = material;
	}
	
	public String getMaterial() {
		return material;
	}
	
	@Override
	public String getCategory() {
		return "Furniture";
	}
}
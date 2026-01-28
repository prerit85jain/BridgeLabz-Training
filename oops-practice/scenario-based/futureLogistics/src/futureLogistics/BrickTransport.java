package futureLogistics;

class BrickTransport extends GoodsTransport{

	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	
	public BrickTransport(String transportId, String transportDate, int transportRating, float brickSize, int brickQuantity, float brickPrice) {
		super(transportId, transportDate, transportRating);
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickPrice = brickPrice;
	}
	
	public float getBrickSize() {return brickSize;}
	public void setBrickSize(float brickSize) {this.brickSize = brickSize;}
	
	public int getBrickQuantity() {return brickQuantity;}
	public void setBrickQuantity(int brickQuantity) {this.brickQuantity = brickQuantity;}
	
	public float getBrickPrice() {return brickPrice;}
	public void setBrickPrice(float brickPrice) {this.brickPrice = brickPrice;}
	
	private int fetchVehiclePrice(String selectedVehicle) {
		if(selectedVehicle.equalsIgnoreCase("Truck")) {
			return 1000;
		}else if(selectedVehicle.equalsIgnoreCase("Lory")) {
			return 1700;
		}else {
			return 3000;
		}
	}
	
	private float calculateDiscountAmt(float amt) {
		float discountedAmt = 0;
		int rating = getTransportRating();
		if(rating == 5) {
			discountedAmt = (float) (amt*0.2);
		}else if(rating > 2) {
			discountedAmt = (float) (amt*0.1);
		}
		return discountedAmt;
	}
	
	@Override
	public String vehicleSelection() {
		if(brickQuantity>500)	return "MonsterLorry";
		else if(brickQuantity>=300) return "Lorry";
		else return "Truck";
	}
	
	@Override
	public float calculateTotalCharge() {
		float price = brickPrice*brickQuantity;
		float tax = (float) (price*0.3);
		float discount = calculateDiscountAmt(price);
		
		String selectedVehicle = vehicleSelection();
		int vehiclePrice = fetchVehiclePrice(selectedVehicle);

		return ((price + vehiclePrice + tax) - discount);
	}

}

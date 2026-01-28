package futureLogistics;

class TimberTransport extends GoodsTransport {

	private float timberLength; 
	private float timberRandius;
	private String timberType;
	private float timberPrice;
	
	public TimberTransport(String transportId, String transportDate, int transportRating, float timberLength, float timberRandius, String timberType, float timberPrice) {
		super(transportId, transportDate, transportRating);
		this.timberLength = timberLength;
		this.timberRandius = timberRandius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;
	}
	
	public float getTimberLength() {return timberLength;}
	public void setTimberLength(float timberLength) {this.timberLength = timberLength;}
	
	public float getTimberRandius() {return timberRandius;}
	public void setTimberRandius(float timberRandius) {this.timberRandius = timberRandius;}
	
	public String getTimberType() {return timberType;}
	public void setTimberType(String timberType) {this.timberType = timberType;}
	
	public float getTimberPrice() {return timberPrice;}
	public void setTimberPrice(float timberPrice) {this.timberPrice = timberPrice;}
	
	private float calculateTimberArea() {
		return (float) (2*3.147*timberRandius*timberLength);
	}
	
	private float calculateTimberVolume() {
		return (float) (Math.PI*timberLength*Math.pow(timberRandius, 2));
	}
	
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
		float area = calculateTimberArea();
		if(area>400) {return "MonsterLorry";}
		else if(area>250) {return "Lorry";}
		else {return "Truck";}
	}
	
	@Override
	public float calculateTotalCharge() {
		float volume = calculateTimberVolume();
		float timberTypePrice = 0;
		if(timberType.equalsIgnoreCase("Premium")) {timberTypePrice = 0.25f;}
		else if(timberType.equalsIgnoreCase("NonPremium")) {timberTypePrice = 0.15f;}
		
		float price = (float) (volume*timberPrice*timberTypePrice);
		
		String selectedVehicle = vehicleSelection();
		int vehiclePrice = fetchVehiclePrice(selectedVehicle);
		
		float tax = (float) (price*0.3);
		
		float discount = calculateDiscountAmt(price);
		return ((price + vehiclePrice + tax)-discount);
	}
	
	
}

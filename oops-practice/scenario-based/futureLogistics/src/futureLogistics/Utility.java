package futureLogistics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Utility {

	public GoodsTransport parseDetails(String input) {
		String[] splitInput = input.split(":");
		
		if(splitInput[3].equalsIgnoreCase("BrickTransport") && validTransportId(splitInput[0])) {
			String transportId = splitInput[0];
			String transportDate = splitInput[1];
			int transportRating = Integer.parseInt(splitInput[2]);
			float brickSize = Float.parseFloat(splitInput[4]);
			int brickQuantity = Integer.parseInt(splitInput[5]);
			float brickPrice = Float.parseFloat(splitInput[6]);
			
			GoodsTransport obj = new BrickTransport(transportId, transportDate, transportRating, brickSize,
					brickQuantity, brickPrice);
			return obj;
		}else if(splitInput[3].equalsIgnoreCase("TimberTransport") && validTransportId(splitInput[0])){
			String transportId = splitInput[0];
			String transportDate = splitInput[1];
			int transportRating = Integer.parseInt(splitInput[2]);
			float timberLength = Float.parseFloat(splitInput[4]);
			float timberRadius = Float.parseFloat(splitInput[5]);
			String timberType = splitInput[6];
			float timberPrice = Float.parseFloat(splitInput[7]);
			
			GoodsTransport obj = new TimberTransport(transportId, transportDate, transportRating, timberLength,
					timberRadius, timberType, timberPrice);
			return obj;
		}
		return null;
	}
	
	public boolean validTransportId(String transportId) {
		String regex = "^RTS[0-9]{3}[A-Z]$";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(transportId);
		
		if(matcher.find()) {
			return true;
		}else {
			System.out.println("Transport id " + transportId + " is invalid");
			System.out.println("Please provide a valid record");
			return false;
		}
	}
	
	public String findObjectType(GoodsTransport goodsTransport) {
		if(goodsTransport instanceof BrickTransport) {
			return "BrickTransport";
		}else if(goodsTransport instanceof TimberTransport) {
			return "TimberTransport";
		}
		return null;
	}
}
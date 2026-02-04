package multiThreading;

public class Chef extends Thread {
	
	private String chefName;
	private String dish;
	private int prepareTime;

	public Chef(String chefName, String dish, int prepareTime) {
		this.chefName = chefName;
		this.dish = dish;
		this.prepareTime = prepareTime;
	}
	
	@Override
	public void run() {
		System.out.println(getName()+ " started preparing "+ dish);
		int stepTime = prepareTime/4;
		
		try {
			for(int i=0; i<=100; i+=25) {
				Thread.sleep(stepTime);
				System.out.println(chefName+ " preparing "+ dish + ": "+ i+"% complete");
			}
			System.out.println(dish+" Prepared");
		}catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
}

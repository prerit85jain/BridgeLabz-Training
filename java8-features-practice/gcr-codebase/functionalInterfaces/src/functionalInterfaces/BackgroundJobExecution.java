package functionalInterfaces;

public class BackgroundJobExecution {

	public static void main(String[] args) throws InterruptedException {
		Runnable job = () -> {
			System.out.println("Background job started");
			try {
				Thread.sleep(2000);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Background job finished");
		};
		
		Thread t = new Thread(job);
		t.start();
		
		System.out.println("Main thread continue");
		Thread.sleep(3000);
		System.out.println("Main thread end");
	}

}

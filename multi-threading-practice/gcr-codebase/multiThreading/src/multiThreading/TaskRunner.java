package multiThreading;

public class TaskRunner extends Thread {

	public TaskRunner(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<3; i++) {
				int sum = 0;
				for(int j=0; j<100000; j++) {
					sum += j;
				}
			}
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

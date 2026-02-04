package multiThreading;

public class Printer {

	public synchronized void printJob(String jobName, int pages, String priority) {
		for(int i=0; i<=pages; i++) {
			System.out.println("["+priority+"] Printing "+jobName+" - Page "+i+" of "+pages);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(jobName + " completed.\n");
	}
}

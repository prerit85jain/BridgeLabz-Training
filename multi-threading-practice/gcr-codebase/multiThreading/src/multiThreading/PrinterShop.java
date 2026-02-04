package multiThreading;

public class PrinterShop {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Starting print jobs...\n");

        long startTime = System.currentTimeMillis();

        Printer printer = new Printer();

        Thread t1 = new Thread(new PrintJob("Job1", 10, printer), "Job1");
        Thread t2 = new Thread(new PrintJob("Job2", 5, printer), "Job2");
        Thread t3 = new Thread(new PrintJob("Job3", 15, printer), "Job3");
        Thread t4 = new Thread(new PrintJob("Job4", 8, printer), "Job4");
        Thread t5 = new Thread(new PrintJob("Job5", 12, printer), "Job5");
        
        t1.setPriority(5);
        t2.setPriority(8);
        t3.setPriority(3);
        t4.setPriority(6);
        t5.setPriority(7);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        
        long endTime = System.currentTimeMillis();

        System.out.println("All jobs completed in " + (endTime - startTime) + " ms");
	}
}

package multiThreading;

public class PrintJob implements Runnable{

	private String jobName;
	private int pageNumber;
	private Printer printer;
	
	public PrintJob(String jobName, int pageNumber, Printer printer) {
		this.jobName = jobName;
		this.pageNumber = pageNumber;
		this.printer = printer;
	}
	
	
	@Override
	 public void run() {
        String priorityLabel;

        if (pageNumber >= 8)
            priorityLabel = "High Priority";
        else if (pageNumber >= 5)
            priorityLabel = "Medium Priority";
        else
            priorityLabel = "Low Priority";

        printer.printJob(jobName, pageNumber, priorityLabel);
    }
}

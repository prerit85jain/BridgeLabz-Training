package basicJUnitTest;

public class TimeOut {
	public String longRunningTask() {
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println("Exception: "+ e.getMessage());
		}
		return "Task Completed";
	}
}

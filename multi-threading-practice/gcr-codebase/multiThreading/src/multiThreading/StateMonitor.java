package multiThreading;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StateMonitor extends Thread{
	
	private Thread t1;
	private Thread t2;
	private boolean monitoring = true;
	
	private Map<String, Set<Thread.State>> stateHistory = new HashMap<>();
	
	public StateMonitor(Thread t1, Thread t2) {
		this.t1 = t1;
		this.t2 = t2;
		
		stateHistory.put(t1.getName(), new HashSet<>());
		stateHistory.put(t2.getName(), new HashSet<>());
	}
	
	@Override
	public void run() {
		try {
			while(monitoring) {
				checkState(t1);
				checkState(t2);
				
				if(t1.getState() == State.TERMINATED && t2.getState() == State.TERMINATED) {
					monitoring = false;
				}
				Thread.sleep(500);
			}
			
			printSummary();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void checkState(Thread t){
		Thread.State state = t.getState();
		stateHistory.get(t.getName()).add(state);
		
		System.out.println("[Monitor] " + t.getName() + " is in "
                + state + " state at " + LocalTime.now());
	}
	
	private void printSummary() {
        System.out.println("\n===== SUMMARY =====");
        for (String threadName : stateHistory.keySet()) {
            System.out.println(threadName + " went through "
                    + stateHistory.get(threadName).size() + " states: "
                    + stateHistory.get(threadName));
        }
    }
}

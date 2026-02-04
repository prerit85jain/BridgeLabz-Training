package multiThreading;

//public class FileDownloader extends Thread {
//	
//	private String fileName;
//	
//	public FileDownloader(String threadName, String fileName) {
//		super(threadName);
//		this.fileName = fileName;
//	}
//	
//	@Override
//	public void run() {
//		for(int process=0; process<=100; process += 25) {
//			System.out.println("[ "+getName()+"] Downloading"+fileName+": "+process+"%");
//			try {
//				Thread.sleep(5000);
//			}catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

public class FileDownloader implements Runnable{
	
	private String fileName;
	
	public FileDownloader(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void run() {
		for(int process=0; process<=100; process += 25) {
			System.out.println("[ "+Thread.currentThread().getName()+"] Downloading"+fileName+": "+process+"%");
			try {
				Thread.sleep(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

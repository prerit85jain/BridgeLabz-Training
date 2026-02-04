package multiThreading;

public class DownloadManager {

	public static void main(String[] args) throws InterruptedException {
		
//		FileDownloader t1 = new FileDownloader("Thread-1", "Document.pdf");
//		FileDownloader t2 = new FileDownloader("Thread-2", "Image.jpg");
//		FileDownloader t3 = new FileDownloader("Thread-3", "Video.mp4");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		
//		t1.join();
//		t2.join();
//		t3.join();
//		
//		System.out.println("All downloads complete!");
		
		Thread t1 = new Thread(new FileDownloader("Document.pdf"), "Thread-1");
		Thread t2 = new Thread(new FileDownloader("Image.jpg"), "Thread-2");
		Thread t3 = new Thread(new FileDownloader("Video.mp4"), "Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("All Downloads complete!");
	}

}

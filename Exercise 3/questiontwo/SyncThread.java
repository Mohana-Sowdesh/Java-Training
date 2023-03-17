package questiontwo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncThread {
	 int i=0;
	 public static void main(String[] args) {
		
		SyncThread syncthread = new SyncThread();
		
		ExecutorService threadObject = Executors.newFixedThreadPool(5);
		
		for(int j=0; j<5; j++) {
			threadObject.execute(() -> {
				syncthread.message();
			});
		}
		threadObject.shutdown();
	}
	 
	public synchronized void message() {
		String msgArray[] = {"Chennai", "Mumbai", "Banglore", "Pune", "Hyderabad"};
		System.out.println("-------"+msgArray[i]+"------");
		i++;
	}
}

package questionseven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountingThread {

	public static void main(String[] args) {
		CountingThread count = new CountingThread();
		
		ExecutorService threadObj = Executors.newFixedThreadPool(1);
		
		threadObj.execute(() -> {
			count.countThread();
		});
	}
	
	synchronized public void countThread() {
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			}
			catch(Exception errMsg) {
				errMsg.printStackTrace();
			}
			
			if(i%10==0)
				System.out.println("Sirius...A CDW Company\n");
		}
	}

}

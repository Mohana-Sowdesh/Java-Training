package questionseven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TenSecondCount {

	public static void main(String[] args) {
<<<<<<< Updated upstream
		TenSecondCount alphabetCount = new TenSecondCount();
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		executorService.execute(() -> {
			alphabetCount.countingThread();
		});
	}
	
	synchronized public void countingThread() {
		for(int i = 1; i <= 100; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			}
			catch(Exception exception) {
				exception.printStackTrace();
			}
			
			if(i % 10 == 0) {
=======
		TenSecondCount tenSecondCount = new TenSecondCount();

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		executorService.execute(() -> {
			tenSecondCount.countThread();
		});
	}

	synchronized public void countThread() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(1000);
			} catch (Exception exception) {
				exception.printStackTrace();
			}

			if (i % 10 == 0) {
>>>>>>> Stashed changes
				System.out.println("Sirius...A CDW Company\n");
			}
		}
	}

}

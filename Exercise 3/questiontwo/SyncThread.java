package questiontwo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncThread {
<<<<<<< Updated upstream
	 int i = 0;
	 public static void main(String[] args) {
		
		SyncThread syncThread = new SyncThread();
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		for(int j = 0; j < 5; j++) {
=======
	int i = 0;

	public static void main(String[] args) {

		SyncThread syncThread = new SyncThread();

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		for (int j = 0; j < 5; j++) {
>>>>>>> Stashed changes
			executorService.execute(() -> {
				syncThread.printMessage();
			});
		}
		executorService.shutdown();
	}
<<<<<<< Updated upstream
	 
	public void printMessage() {
		String msgArray[] = {"Chennai", "Mumbai", "Banglore", "Pune", "Hyderabad"};
		System.out.println("-------"+msgArray[i]+"------");
=======

	public void printMessage() {
		String msgArray[] = { "Chennai", "Mumbai", "Banglore", "Pune", "Hyderabad" };
		System.out.println("-------" + msgArray[i] + "------");
>>>>>>> Stashed changes
		i++;
	}
}

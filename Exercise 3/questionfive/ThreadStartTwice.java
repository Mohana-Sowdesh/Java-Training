package questionfive;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadStartTwice {

	public static void main(String[] args) {
<<<<<<< Updated upstream
		
=======

>>>>>>> Stashed changes
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread started....");
			}
		});
<<<<<<< Updated upstream
		
=======

>>>>>>> Stashed changes
		thread1.start();
		thread1.start();
	}

}

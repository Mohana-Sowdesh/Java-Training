package questionfive;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadStartTwice {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread started....");
			}
		});
		
		thread1.start();
		thread1.start();
	}

}

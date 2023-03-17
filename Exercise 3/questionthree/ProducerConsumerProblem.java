package questionthree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerProblem {
	
	public static void main(String[] args) {
		int product = 0;
		Inventory producer = new Inventory();
		
		ExecutorService threadObject = Executors.newFixedThreadPool(2);
		
		threadObject.execute(() -> {
			for(int j=0; j<3; j++) {
				producer.produceProduct();
			}
		});
		
		threadObject.execute(() -> {
			for(int j=0; j<3; j++) {
				producer.consumeProduct();
			}
		});	
		threadObject.shutdown();
	}

}

class Inventory {
	int product = 0;
	synchronized public void produceProduct() {
		if(product==1) {
			try {
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Product produced");
		product = 1;
		notify();
	}

	synchronized public void consumeProduct() {
		if(product==0) {
			try {
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Product consumed");
		product = 0;
		notify();
	}
}
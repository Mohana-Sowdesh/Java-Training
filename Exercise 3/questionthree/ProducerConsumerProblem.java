package questionthree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.execute(() -> {
			for (int j = 0; j < 3; j++) {
				inventory.produceProduct();
			}
		});

		executorService.execute(() -> {
			for (int j = 0; j < 3; j++) {
				inventory.consumeProduct();
			}
		});
		executorService.shutdown();
	}

}

class Inventory {
	int productState = 0;

	synchronized public void produceProduct() {
		if (productState == 1) {
			try {
				wait();
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		System.out.println("Product produced");
		productState = 1;
		notify();
	}

	synchronized public void consumeProduct() {
		if (productState == 0) {
			try {
				wait();
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		System.out.println("Product consumed");
		productState = 0;
		notify();
	}
}
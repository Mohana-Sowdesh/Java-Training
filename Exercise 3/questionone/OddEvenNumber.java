package questionone;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenNumber {
	public static void main(String[] args) {
		OddEvenNumber oddEvenNumber = new OddEvenNumber();

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.execute(() -> {
			oddEvenNumber.printOddNumber();
		});

		executorService.execute(() -> {
			oddEvenNumber.printEvenNumber();
		});

		executorService.shutdown();
	}

	public synchronized void printEvenNumber() {
		System.out.println("\n\nEven numbers:");
		int number = 1;
		while (number <= 100) {
			if (number % 2 == 0) {
				System.out.println(number + " ");
			}
			number++;
		}
	}

	public synchronized void printOddNumber() {
		System.out.println("Odd numbers:");
		int number = 1;
		while (number <= 100) {
			if (number % 2 == 1) {
				System.out.println(number + " ");
			}
			number++;
		}
	}
}

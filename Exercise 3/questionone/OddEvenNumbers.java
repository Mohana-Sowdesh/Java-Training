package questionone;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenNumbers {
	public static void main(String[] args) {
		OddEvenNumbers oddEvenNumbers = new OddEvenNumbers();
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		executorService.execute(() -> {
			oddEvenNumbers.printOddNumbers();
		});
		
		executorService.execute(() -> {
			oddEvenNumbers.printEvenNumbers();
		});
		
		executorService.shutdown();		
	}

	public synchronized void printEvenNumbers() {
		System.out.println("\n\nEven numbers:");
		int number = 1;
		while(number <= 100) {
			if(number % 2 == 0) {
				System.out.println(number + " ");
			}
			number++;
		}
	}
	
	public synchronized void printOddNumbers() {
		System.out.println("Odd numbers:");
		int number = 1;
		while(number <= 100) {
			if(number % 2 == 1) {
				System.out.println(number + " ");
			}
			number++;
		}
	}
}




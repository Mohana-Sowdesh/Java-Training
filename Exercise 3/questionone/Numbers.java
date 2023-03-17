package questionone;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Numbers {
	public static void main(String[] args) {
		Numbers num = new Numbers();
		
		ExecutorService threadObject = Executors.newFixedThreadPool(2);
		
		threadObject.execute(() -> {
			num.oddNumbers();
		});
		
		threadObject.execute(() -> {
			num.evenNumbers();
		});
		
		threadObject.shutdown();		
	}

	public synchronized void evenNumbers() {
		System.out.println("\n\nEven numbers:");
		int number = 1;
		while(number<=100) {
			if(number%2==0)
				System.out.println(number+" ");
			number++;
		}
	}
	
	public synchronized void oddNumbers() {
		System.out.println("Odd numbers:");
		int number = 1;
		while(number<=100) {
			if(number%2==1)
				System.out.println(number+" ");
			number++;
		}
	}
}




package questionsix;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AlphabetCount {
<<<<<<< Updated upstream
	int countOfCharacters = 0;
	public static void main(String[] args) throws NonAlphabeticCharacter {
		AlphabetCount alphabetCount = new AlphabetCount();
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.execute(() -> {
			while(true) {
				try {
					System.out.println("Please enter an alphabetic character:");
					alphabetCount.checkingCharacters();
				}
				catch(Exception exception) {
=======
	int countOfCharacter = 0;

	public static void main(String[] args) throws NonAlphabeticCharacter {
		AlphabetCount alphabetCount = new AlphabetCount();

		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.execute(() -> {
			while (true) {
				try {
					System.out.println("Please enter an alphabetic character:");
					alphabetCount.checkCharacter();
				} catch (Exception exception) {
>>>>>>> Stashed changes
					exception.printStackTrace();
					System.exit(0);
				}
			}
		});
	}
<<<<<<< Updated upstream
		

	synchronized public void checkingCharacters() throws NonAlphabeticCharacter{
		Scanner scanner = new Scanner(System.in);
		char character = scanner.next().charAt(0);
		if(Character.isLetter(character))
		{
			countOfCharacters++;
			System.out.println("Charcter entered: " + character);
		}
		else
		{
			System.out.println("Count of characters: " + countOfCharacters);
=======

	synchronized public void checkCharacter() throws NonAlphabeticCharacter {
		Scanner scanner = new Scanner(System.in);
		char character = scanner.next().charAt(0);
		if (Character.isLetter(character)) {
			countOfCharacter++;
			System.out.println("Charcter entered: " + character);
		} else {
			System.out.println("Count of characters: " + countOfCharacter);
>>>>>>> Stashed changes
			throw new NonAlphabeticCharacter("Please enter only alphabetic characters!!");
		}
	}
}

class NonAlphabeticCharacter extends Exception {
	public NonAlphabeticCharacter(String exception) {
		super(exception);
	}
}

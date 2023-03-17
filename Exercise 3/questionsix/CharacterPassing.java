package questionsix;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CharacterPassing {
	int countOfCharacters = 0;
	public static void main(String[] args) throws NonAlphabeticCharacter {
		CharacterPassing ch = new CharacterPassing();
		
		ExecutorService threadObj = Executors.newFixedThreadPool(1);
		threadObj.execute(() -> {
			while(true) {
				try {
					System.out.println("Please enter an alphabetic character:");
					ch.charCheck();
				}
				catch(Exception errMsg) {
					errMsg.printStackTrace();
					System.exit(0);
				}
			}
		});
	}
		

	synchronized public void charCheck() throws NonAlphabeticCharacter{
		Scanner jc = new Scanner(System.in);
		char character = jc.next().charAt(0);
		if(Character.isLetter(character))
		{
			countOfCharacters++;
			System.out.println("Charcter entered: "+character);
		}
		else
		{
			System.out.println("Count of characters: "+countOfCharacters);
			throw new NonAlphabeticCharacter("Please enter only alphabetic characters!!");
		}
	}
}

class NonAlphabeticCharacter extends Exception {
	public NonAlphabeticCharacter(String errMsg) {
		super(errMsg);
	}
}

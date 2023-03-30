package questionone;

import java.util.Scanner;

public class CharacterCounter {

	public static void main(String[] args) {
		int countOfchars = 0;
		try {
			Scanner scanner = new Scanner(System.in);
	
			while (true) {
				System.out.println("Please enter a character: ");
				char character = scanner.next().charAt(0);
	
				countOfchars++;
	
				if (character == 'q')
					break;
			}
			scanner.close();
		}
		catch(Exception e) {
			
		}
		finally {
			System.out.println("No. of characters entered: " + countOfchars);
		}
	}

}

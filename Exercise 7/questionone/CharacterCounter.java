package questionone;

import java.util.Scanner;

public class CharacterCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int countOfchars = 0;

		while (true) {
			System.out.println("Please enter a character: ");
			char character = scanner.next().charAt(0);

			countOfchars++;

			if (character == 'q')
				break;
		}
		System.out.println("No. of characters entered: " + countOfchars);
	}

}

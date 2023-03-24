package questiontwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordsCounter {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter a string:");
		try {
			String string = bufferedReader.readLine();
			String wordArray[] = string.split(" ");
			System.out.println("No. of words entered in the string is " + wordArray.length);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

}

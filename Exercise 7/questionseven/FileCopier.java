package questionseven;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopier {

	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader("fileSource.txt");
			FileWriter fileWriter = new FileWriter("fileDestination.txt");

			char charArray[] = new char[64];
			int i = 0;
			while ((i = fileReader.read(charArray)) != -1) {
				String copiedData = new String(charArray, 0, i);
				System.out.println(copiedData);
				fileWriter.write(copiedData);
			}
			
			fileWriter.close();
			fileReader.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
	}

}

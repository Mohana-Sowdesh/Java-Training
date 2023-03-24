package questionnine;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class DateObjectWriterReader {
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("fileDate.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			Date date = new Date();

			objectOutputStream.writeObject(date);
			
			FileInputStream fileInputStream = new FileInputStream("fileDate.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			System.out.println(objectInputStream.readObject());
			
			fileOutputStream.close();
			objectOutputStream.close();
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
	}
}

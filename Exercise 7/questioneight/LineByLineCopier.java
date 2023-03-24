package questioneight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LineByLineCopier {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader(new File("fileCopy.txt"));
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			StringBuffer stringBuffer = new StringBuffer();
			String sentence = "";
			
			while((sentence = bufferedReader.readLine())!=null) {
				stringBuffer.append(sentence);
				stringBuffer.append("\t");
			}
			System.out.println(stringBuffer.toString());
			fileReader.close();
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
	}

}

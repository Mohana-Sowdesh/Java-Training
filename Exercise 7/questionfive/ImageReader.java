package questionfive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageReader {

	public static void main(String[] args) {
		File sourcePath = new File("/Users/mohanasowdesh/eclipse-workspace/Exercise7/tree_image.jpeg");
		File destinationPath =new File("/Users/mohanasowdesh/eclipse-workspace/Exercise7/tree.jpeg");
		
		try {
			FileInputStream inputStream = new FileInputStream(sourcePath);
			FileOutputStream outputStream = new FileOutputStream(destinationPath);
			
			byte byteArray[] = new byte[32];
			
			while(inputStream.read(byteArray)!=-1)
			{
				outputStream.write(byteArray);
			}
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
		System.out.println("Image copied successfully!!");
		
	}
}

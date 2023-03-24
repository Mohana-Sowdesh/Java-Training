package questionfour;

import java.io.File;

public class FileLister {

	public static void main(String[] args) {
		File directory = new File("/Users/mohanasowdesh/eclipse-workspace/Exercise1");

		String filesInDirectory[] = directory.list();

		System.out.println("Files in the given directory:");
		for (int i = 0; i < filesInDirectory.length; i++) {
			System.out.println(filesInDirectory[i]);
		}
	}

}

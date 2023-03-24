package questionthree;

import java.io.File;

public class FileManipulator {

	public static void main(String[] args) {
		File createdFile = new File("/Users/mohanasowdesh/eclipse-workspace/Exercise7/fileCreated.txt");
		File deletedFile = new File("/Users/mohanasowdesh/eclipse-workspace/Exercise7/fileDeleted.txt");
		File renamedFile = new File("/Users/mohanasowdesh/eclipse-workspace/Exercise7/fileRenamed.txt");

		if (deletedFile.delete()) {
			System.out.println("File deleted successfully!!");
		} else {
			System.out.println("File deletion unsuccessful!!");
		}

		boolean renameFlag = createdFile.renameTo(renamedFile);

		if (renameFlag) {
			System.out.println("File renamed successfully!!");
		} else {
			System.out.println("File renaming unsuccessful!!");
		}

		System.out.println("File size of renamed file:" + renamedFile.length());
	}

}

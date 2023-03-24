package mementopattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class MementoPattern {

	public static void main(String[] args) throws Exception {
		SnakeLadderGame snakeLadderGame = new SnakeLadderGame();
		System.out.println("Snake and Ladder game started...");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("snake & ladder.dat"));
		
		snakeLadderGame.userPosition = 64;
		objectOutputStream.writeObject(snakeLadderGame);
		System.out.println("User position is "+snakeLadderGame.userPosition);
		
		snakeLadderGame.userPosition = 78;
		objectOutputStream.writeObject(snakeLadderGame);
		System.out.println("User position is "+snakeLadderGame.userPosition);
		
		System.out.println("On encountering a snake in the cell...");
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("snake & ladder.dat"));
		snakeLadderGame = (SnakeLadderGame)objectInputStream.readObject();
		System.out.println("User position is "+snakeLadderGame.userPosition);
	}

}

class SnakeLadderGame implements Serializable {
	int userPosition = 1;
}

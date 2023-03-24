package flyweightpattern;

public class FlyweightPattern {

	public static void main(String[] args) {
		LudoCoin ludoBoard[] = { new LudoCoin(), new LudoCoin(), new LudoCoin(), new LudoCoin() };
		ludoBoard[0].moveCoin(0, 15, 22);
		ludoBoard[1].moveCoin(1, 5, 9);
		ludoBoard[2].moveCoin(2, 2, 8);
		ludoBoard[3].moveCoin(3, 0, 1);
	}

}

interface Ludo {
	public void moveCoin(int coinNumber, int currentPosition, int newPosition);
}

class LudoCoin implements Ludo {
	private LudoFactory ludoCoin = LudoFactory.getLudoCoin();
	private int currentPosition = 0;

	@Override
	public void moveCoin(int coinNumber, int currentPosition, int newPosition) {
		System.out.println(ludoCoin.coinShape + " shaped coin " + coinNumber + " moved from " + currentPosition + " to "
				+ newPosition);
		currentPosition = newPosition;
	}
}

class LudoFactory {
	private static LudoFactory ludoCoin;

	public String coinShape;

	public LudoFactory(String coinShape) {
		this.coinShape = coinShape;
	}

	synchronized public static LudoFactory getLudoCoin() {
		if (ludoCoin == null) {
			ludoCoin = new LudoFactory("Round");
		}
		return ludoCoin;
	}
}

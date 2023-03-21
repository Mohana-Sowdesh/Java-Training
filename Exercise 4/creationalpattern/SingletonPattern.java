package creationalpattern;

public class SingletonPattern {
	
	private static SingletonPattern chosenPresident = null;
	private static String president = null;
	
	private SingletonPattern(String president) {
		this.president = president;
	}
	
	public static synchronized SingletonPattern checkPresidentStatus() {
		if(president == null) {
			chosenPresident = new SingletonPattern("Ms. Draupadi Murmu");
			System.out.println("President of India is " + president);
		}
		return chosenPresident;
	}
	
	public static void main(String[] args) {
		SingletonPattern president2023 = SingletonPattern.checkPresidentStatus();
		SingletonPattern president2024 = SingletonPattern.checkPresidentStatus();
		
		System.out.println("Hashcode of president2023 is " + president2023.hashCode());
		System.out.println("Hashcode of president2024 is " + president2024.hashCode());
	}
}
package bridgepattern;

public class BridgePattern {

	public static void main(String[] args) {
		Idly idly = new Idly(new Podi());
		Dosa dosa = new Dosa(new Ghee());
	}

}

abstract class Flour {
	public abstract void prepareFood();
}

abstract class Flavour {
	public abstract void addFlavour();
}

class Idly extends Flour {
	public Idly(Flavour flavour) {
		this.prepareFood();
		this.addFlavour(flavour);
	}
	
	@Override
	public void prepareFood() {
		System.out.println("Idly prepared from flour...");
	}

	public void addFlavour(Flavour flavour) {
		System.out.println("Prepared podi idly...");
	}
}

class Dosa extends Flour {
	public Dosa(Flavour flavour) {
		this.prepareFood();
		this.addFlavour(flavour);
	}
	
	@Override
	public void prepareFood() {
		System.out.println("Dosa prepared from flour...");
	}
	
	public void addFlavour(Flavour flavour) {
		System.out.println("Prepared ghee dosa...");
	}
}

class Podi extends Flavour {

	@Override
	public void addFlavour() {
		System.out.println("Added podi...");
	}

}

class Ghee extends Flavour {

	@Override
	public void addFlavour() {
		System.out.println("Added ghee...");
	}

}

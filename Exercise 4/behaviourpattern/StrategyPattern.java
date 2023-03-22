package behaviourpattern;

public class StrategyPattern {

	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.simCompany = new Jio();
		phone.simCompany.printSimCompany();
	}

}

class Phone {
	SimCompany simCompany;

	public SimCompany getSim() {
		return simCompany;
	}
}

abstract class SimCompany {
	abstract void printSimCompany();
}

class Jio extends SimCompany {

	@Override
	void printSimCompany() {
		System.out.println("This is Jio sim...");
	}

}

class Airtel extends SimCompany {

	@Override
	void printSimCompany() {
		System.out.println("This is Airtel sim...");
	}

}

class VI extends SimCompany {

	@Override
	void printSimCompany() {
		System.out.println("This is Vodafone Idea sim...");
	}

}

class BSNL extends SimCompany {

	@Override
	void printSimCompany() {
		System.out.println("This is BSNL sim...");
	}

}
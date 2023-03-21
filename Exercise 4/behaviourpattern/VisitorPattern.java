package behaviourpattern;

import java.util.Scanner;

public class VisitorPattern {

	public static void main(String[] args) throws Exception {
		WashingMachine washingMachine = new WashingMachine();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the mode in which washing machine should be operated: ");
		String modeOfOperation = scanner.next();
		Mode mode = (Mode)Class.forName(modeOfOperation).newInstance();
		washingMachine.modeOfOperation(mode);
	}

}

class WashingMachine {
	public WashingMachine() {
		System.out.println("Washing Machine started...");
	}
	
	public void modeOfOperation(Mode mode) {
		mode.execute();
	}
}

abstract class Mode {
	public abstract void execute();
}

class Delicate extends Mode {
	@Override
	public void execute() {
		System.out.println("Delicate mode on...");
	}
}

class Normal extends Mode {
	@Override
	public void execute() {
		System.out.println("Normal mode on...");
	}
}

class Heavy extends Mode {
	@Override
	public void execute() {
		System.out.println("Heavy mode on...");
	}
}

class Dryer extends Mode {
	@Override
	public void execute() {
		System.out.println("Dryer mode on...");
	}
}
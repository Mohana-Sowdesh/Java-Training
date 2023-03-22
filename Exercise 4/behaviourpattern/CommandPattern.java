package behaviourpattern;

public class CommandPattern {

	public static void main(String[] args) {
		Robot robot = new Robot();

		robot.setCommand(0, new EnterSourceDestination());
		robot.setCommand(1, new CheckAvailability());
		robot.setCommand(2, new EnterDetails());
		robot.setCommand(3, new MakePayment());
		robot.setCommand(4, new CheckConfirmation());

		for (int i = 0; i < 5; i++) {
			robot.executeCommand(i);
		}
	}
}

class Robot {
	BookTicket bookTicketArray[] = new BookTicket[5];

	public void executeCommand(int order) {
		bookTicketArray[order].execute();
	}

	public void setCommand(int order, BookTicket bookTicket) {
		bookTicketArray[order] = bookTicket;
	}
}

abstract class BookTicket {
	EnterSourceDestination sourceDestination;
	CheckAvailability checkAvailability;
	EnterDetails enterDetails;
	MakePayment makePayment;
	CheckConfirmation checkConfirmation;

	public abstract void execute();
}

class EnterSourceDestination extends BookTicket {
	@Override
	public void execute() {
		System.out.println("Enter the source and destination in ticket booking app");
	}
}

class CheckAvailability extends BookTicket {
	@Override
	public void execute() {
		System.out.println("Check the availability of seats in that route");
	}
}

class EnterDetails extends BookTicket {
	@Override
	public void execute() {
		System.out.println("Enter passenger details");
	}
}

class MakePayment extends BookTicket {
	@Override
	public void execute() {
		System.out.println("Make the payment for the ticket");
	}
}

class CheckConfirmation extends BookTicket {
	@Override
	public void execute() {
		System.out.println("Check if the payment was successful and received a sms/email");
	}
}

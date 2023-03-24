package behaviourpattern;

public class CommandPattern {

	public static void main(String[] args) {
		Robot robot = new Robot();

		robot.setCommand(0, new SourceDestinationGetter());
		robot.setCommand(1, new AvailabilityChecker());
		robot.setCommand(2, new DetailsGetter());
		robot.setCommand(3, new PaymentMaker());
		robot.setCommand(4, new ConfirmationChecker());

		for (int i = 0; i < 5; i++) {
			robot.executeCommand(i);
		}
	}
}

class Robot {
	TicketBooker bookTicketArray[] = new TicketBooker[5];

	public void executeCommand(int order) {
		bookTicketArray[order].execute();
	}

	public void setCommand(int order, TicketBooker bookTicket) {
		bookTicketArray[order] = bookTicket;
	}
}

abstract class TicketBooker {
	SourceDestinationGetter sourceDestinationGetter;
	AvailabilityChecker availabilityChecker;
	DetailsGetter detailsGetter;
	PaymentMaker paymentMaker;
	ConfirmationChecker confirmationChecker;

	public abstract void execute();
}

class SourceDestinationGetter extends TicketBooker {
	@Override
	public void execute() {
		System.out.println("Enter the source and destination in ticket booking app");
	}
}

class AvailabilityChecker extends TicketBooker {
	@Override
	public void execute() {
		System.out.println("Check the availability of seats in that route");
	}
}

class DetailsGetter extends TicketBooker {
	@Override
	public void execute() {
		System.out.println("Enter passenger details");
	}
}

class PaymentMaker extends TicketBooker {
	@Override
	public void execute() {
		System.out.println("Make the payment for the ticket");
	}
}

class ConfirmationChecker extends TicketBooker {
	@Override
	public void execute() {
		System.out.println("Check if the payment was successful and received a sms/email");
	}
}

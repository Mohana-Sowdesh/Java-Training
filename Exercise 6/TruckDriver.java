package truckdriver;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class TruckDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the speed of driver: ");
		int speed = scanner.nextInt();

		System.out.println("Enter the distance to be travelled: ");
		int distance = scanner.nextInt();

		System.out.println("Enter start date of journey: ");
		LocalDate journeyStartDate = LocalDate.parse(scanner.next());

		System.out.println("Enter start time of journey: ");
		LocalTime journeyStartTime = LocalTime.parse(scanner.next());

		JourneyDaysCalculator journeyDaysCalculator = new JourneyDaysCalculator();
		journeyDaysCalculator.calculateTime(speed, distance, journeyStartDate, journeyStartTime);
	}

}

class JourneyDaysCalculator {
	public void calculateTime(int speed, int distance, LocalDate date, LocalTime time) {
		int workingHrsPerDay = 8;
		int distanceTravelledToday = 0;
		int minutes = time.getMinute();
		int timeNeeded = distance / speed;

		int drivingHrsPresentToday = 24 - time.getHour();
		if (drivingHrsPresentToday < workingHrsPerDay) {
			distanceTravelledToday = speed * drivingHrsPresentToday;
			time = time.plusHours(drivingHrsPresentToday);
			timeNeeded -= drivingHrsPresentToday;
			distance -= distanceTravelledToday;
			date = date.plusDays(1);
		}

		while (timeNeeded > 0) {
			time = time.MIDNIGHT;
			if (timeNeeded < workingHrsPerDay) {
				distanceTravelledToday = speed * timeNeeded;
				time = time.plusHours(timeNeeded);
				timeNeeded = 0;
			} else {
				distanceTravelledToday = speed * workingHrsPerDay;
				timeNeeded -= workingHrsPerDay;
			}

			distance -= distanceTravelledToday;

			if ((date.getDayOfWeek().getValue() == 7) 
					|| (date.getDayOfMonth() == 1 && date.getMonth().getValue() == 1)
					|| (date.getDayOfMonth() == 15 && date.getMonth().getValue() == 8)
					|| (date.getDayOfMonth() == 1 && date.getMonth().getValue() == 26)
					|| ((date.getDayOfMonth() >= 8 && date.getDayOfMonth() <= 14)
							&& (date.getDayOfWeek().getValue() == 6))) {
				date = date.plusDays(1);
			}

			if (distance > 0 || timeNeeded > 0) {
				date = date.plusDays(1);
			}
		}

		time = time.plusMinutes(minutes);
		System.out.println("The driver will reach on " + date + " " + time);
	}
}
package questionfour;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClock {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		
		int hour = dateTime.getHour();
		int minute = dateTime.getMinute();
		int second = dateTime.getSecond();
		
		Time timeObj = new Time();
		
		ExecutorService threadObject = Executors.newFixedThreadPool(1);
		threadObject.execute(() -> {
			timeObj.incrementTime(hour, minute, second);
		});
	}
}

class Time {
	synchronized public void incrementTime(int hour, int minute, int second) {
		while(true) {
			second++;
			
			if(second==60) {
				second = 0; 
				minute++;
			}
			
			if(minute==60) {
				minute = 0;
				hour++;
			}
			
			if(hour>12) {
				hour = hour-12;
			}
			
			try {
				wait(1000);
			}
			catch(Exception errMsg) {
				errMsg.printStackTrace();
			}
			
			System.out.println(hour+":"+minute+":"+second);
		}
		
	}
}


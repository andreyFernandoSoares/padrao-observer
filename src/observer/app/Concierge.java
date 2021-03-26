package observer.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Concierge extends Thread {
	
	List<SurpriseBirthdayObserver> observers = new ArrayList<>();
	
	public void addSurpriseBirthdayObserver(SurpriseBirthdayObserver observer) {
		observers.add(observer);
	}
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Integer value = scanner.nextInt();
			
			if (value == 1) {
				BirthdayArrivalEvent event = new BirthdayArrivalEvent(new Date());
				
				for (SurpriseBirthdayObserver observer : observers) 
					observer.iTArrived(event);
			} else
				System.out.println("Sorvete Galera.");
		}
	}
}

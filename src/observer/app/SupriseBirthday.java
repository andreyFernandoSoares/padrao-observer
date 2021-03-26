package observer.app;

public class SupriseBirthday {
	
	public static void main(String[] args) {
		Girlfriend girlfriend = new Girlfriend();
		Concierge concierge = new Concierge();
		concierge.addSurpriseBirthdayObserver(girlfriend);
		concierge.start();
	}
}

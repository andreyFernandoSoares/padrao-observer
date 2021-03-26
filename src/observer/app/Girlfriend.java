package observer.app;

public class Girlfriend implements SurpriseBirthdayObserver {

	@Override
	public void iTArrived(BirthdayArrivalEvent event) {
		System.out.println("Ele chegou...");
		System.out.println("Vamos apagar as luzes...");
		System.out.println("Surpresa!!!");
	}
}

package observer.app;

import java.util.Date;

public class BirthdayArrivalEvent {
	
	private Date currentDate;
	
	public BirthdayArrivalEvent(Date currentDate) {
		this.currentDate = currentDate;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
}

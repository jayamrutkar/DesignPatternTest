package mediator.air.traffic.controller;

public class Flight implements Command {

	private String id;
	private IATCMediator mediator;
	private int altitude;

	public Flight(String id, IATCMediator mediator, int altitude) {
		this.id = id;
		this.mediator = mediator;
		this.altitude = altitude;
	}

	public void changeAltitude(int altitudeDifferece) {
		int currentAltitude = altitude;
		this.altitude = altitudeDifferece + currentAltitude;

		System.out.println("Altitude is changed from " + currentAltitude
				+ " to new altitude " + this.altitude);
		mediator.updateLocation(this);
	}

	@Override
	public void land() {

		if (mediator.isLandingOk()) {
			System.out.println("Landing done...");
			mediator.setLandingStatus(true);
		} else {
			System.out.println("Will wait to land...");
		}

	}

	public void getReady() {
		System.out.println("Getting ready...");
	}

	public String getId() {
		return id;
	}

	public int getAltitude() {
		return altitude;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", altitude=" + altitude + "]\n";
	}
	
	

}
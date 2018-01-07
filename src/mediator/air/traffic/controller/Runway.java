package mediator.air.traffic.controller;

public class Runway implements Command{
	
	IATCMediator mediator;

	public Runway(IATCMediator mediator) {
		this.mediator = mediator;
	}


	@Override
	public void land() {
		System.out.println("Can land. go ahead.");
		mediator.setLandingStatus(true);
	}

}

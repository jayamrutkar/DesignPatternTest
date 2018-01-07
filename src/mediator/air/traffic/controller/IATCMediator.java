package mediator.air.traffic.controller;

import java.util.List;

public interface IATCMediator {

	void registerRunway(Runway runway);
	
	void registerFlight(Flight flight);
	
	boolean isLandingOk();
	
	void setLandingStatus(boolean status);

	void updateLocation(Flight flight);
	
	List<Flight> getAllFlights();
}

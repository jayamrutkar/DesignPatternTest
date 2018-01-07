package mediator.air.traffic.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ATCMediator implements IATCMediator {

	private int MIN_DIFF_BETWEEN_FLIGHTS = 2000;

	private List<Flight> flights;
	private Runway runway;

	private Set<Flight> visitedFlights = new HashSet<Flight>();

	private boolean land;

	public ATCMediator() {
		super();
		this.flights = new ArrayList<Flight>();
	}

	public List<Flight> getAllFlights() {
		return flights;
	}

	@Override
	public void registerRunway(Runway runway) {
		this.setRunway(runway);
	}

	@Override
	public void registerFlight(Flight flight) {
		this.flights.add(flight);
		visitedFlights.clear();
		updateLocation(flight);
	}

	@Override
	public boolean isLandingOk() {
		return land;
	}

	@Override
	public void setLandingStatus(boolean status) {
		land = status;
	}

	@Override
	public void updateLocation(Flight flight) {

		visitedFlights.add(flight);
		List<Flight> nearestFlights = new ArrayList<Flight>(this.flights);
		nearestFlights.remove(flight);

		Iterator<Flight> iterator = nearestFlights.iterator();

		while (iterator.hasNext()) {
			Flight other = iterator.next();
			if (visitedFlights.contains(other)
					|| Math.abs(other.getAltitude() - flight.getAltitude()) >= MIN_DIFF_BETWEEN_FLIGHTS) {
				iterator.remove();
			}
		}

		if (nearestFlights.size() > 0) {

			Collections.sort(nearestFlights, new Comparator<Flight>() {

				@Override
				public int compare(Flight o1, Flight o2) {
					return o1.getAltitude() - o2.getAltitude();
				}

			});

			for (Flight near : nearestFlights) {
				if (Math.abs(near.getAltitude() - flight.getAltitude()) < MIN_DIFF_BETWEEN_FLIGHTS) {

					near.changeAltitude(MIN_DIFF_BETWEEN_FLIGHTS);
				}
			}

		} else {
			System.out.println("No near flights. please go ahead.");
		}

	}

	public void setRunway(Runway runway) {
		this.runway = runway;
	}

	public Runway getRunway() {
		return runway;
	}

}
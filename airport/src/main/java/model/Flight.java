package model;

import java.util.ArrayList;
import java.util.List;

public class Flight {

	private String id;
	private List<Passenger> passengersList = new ArrayList<Passenger>();
	private String flightType;

	public Flight(String id, String flightType) {
		this.id = id;
		this.flightType = flightType;
	}

	public String getId() {
		return id;
	}

	public List<Passenger> getPassengersList() {
		return passengersList;
	}

	public String getFlightType() {
		return flightType;
	}

}

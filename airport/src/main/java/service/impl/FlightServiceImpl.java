package service.impl;

import exception.FlightServiceException;
import model.Flight;
import model.Passenger;
import service.FlightService;

public class FlightServiceImpl implements FlightService {
	public boolean addPassenger(Passenger passenger, Flight flight) throws FlightServiceException {
		switch (flight.getFlightType()) {
			case "Economy":
				return flight.getPassengersList().add(passenger);
			case "Business":
				if (passenger.isVip()) {
					return flight.getPassengersList().add(passenger);
				}
				return false;
			default:
				throw new FlightServiceException("Unknown type: " + flight.getFlightType());
		}

	}
	public boolean removePassenger(Passenger passenger, Flight flight) throws FlightServiceException {
		switch (flight.getFlightType()) {
			case "Economy":
				if (!passenger.isVip()) {
					return flight.getPassengersList().remove(passenger);
				}
				return false;
			case "Business":
				return false;
			default:
				throw new FlightServiceException("Unknown type: " + flight.getFlightType());
			}
	}

}

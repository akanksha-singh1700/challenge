package service;

import exception.FlightServiceException;
import model.Flight;
import model.Passenger;

public interface FlightService {
	public boolean addPassenger(Passenger passenger, Flight flight) throws FlightServiceException;
	public boolean removePassenger(Passenger passenger, Flight flight) throws FlightServiceException;
}

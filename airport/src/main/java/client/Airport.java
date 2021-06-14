package client;

import exception.FlightServiceException;
import model.Flight;
import model.Passenger;
import service.FlightService;
import service.impl.FlightServiceImpl;

public class Airport {

    public static void main(String[] args) {
    	FlightService fserv=new FlightServiceImpl();
        Flight economyFlight = new Flight("1", "Economy");
        Flight businessFlight = new Flight("2", "Business");

        Passenger john = new Passenger("John", true);
        Passenger mike = new Passenger("Mike", false);

        try {
			fserv.addPassenger(john,businessFlight);
			 fserv.removePassenger(john,businessFlight);
		        fserv.addPassenger(mike,businessFlight);
		       fserv.addPassenger(mike, economyFlight);
		} catch (FlightServiceException e) {
			
			e.getMessage();
		}
       

        System.out.println("Business flight passengers list:");
        for (Passenger passenger: businessFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }

        System.out.println("Economy flight passengers list:");
        for (Passenger passenger: economyFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }
    }
}

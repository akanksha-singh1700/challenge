package airport;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import exception.FlightServiceException;
import model.Flight;
import model.Passenger;
import service.FlightService;

@ExtendWith(MockitoExtension.class)
public class AirportTest {
	@Mock
	FlightService fserv;

	@Test
	public void testAirport() throws FlightServiceException {
		Flight economyFlight = new Flight("1", "Economy");
		Flight businessFlight = new Flight("2", "Business");
		List<Passenger> p = new ArrayList<Passenger>();
		Passenger john = new Passenger("John", true);
		Passenger mike = new Passenger("Mike", false);

		// FlightService fserv=Mockito.mock(FlightService.class);

		when(fserv.addPassenger(john, economyFlight)).thenReturn(p.add(john));
		assertEquals(true, fserv.addPassenger(john, economyFlight));
		verify(fserv).addPassenger(john, economyFlight);

		/*
		 * when(fserv.removePassenger(john, economyFlight)).thenReturn(p.remove(john));
		 * assertEquals(false, fserv.removePassenger(john, economyFlight));
		 * assertEquals(true, fserv.addPassenger(john, businessFlight));
		 * assertEquals(false, fserv.removePassenger(john, businessFlight));
		 * 
		 * assertEquals(true, fserv.addPassenger(mike, economyFlight));
		 * assertEquals(true, fserv.removePassenger(mike, economyFlight));
		 * assertEquals(false, fserv.addPassenger(mike, businessFlight));
		 * assertEquals(false, fserv.removePassenger(mike, businessFlight));
		 * 
		 * assertNotNull(businessFlight); assertTrue(fserv.addPassenger(john,
		 * economyFlight));
		 */

	}

}

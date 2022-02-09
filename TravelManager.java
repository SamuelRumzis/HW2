package org.depaul.se350.hw1;

import org.depaul.se350.hw1.airline.Airline;
import org.depaul.se350.hw1.airport.Airport;
import org.depaul.se350.hw1.exception.BadParameterException;
import org.depaul.se350.hw1.exception.NullParameterException;
import org.depaul.se350.hw1.flight.CommercialFlight;
import org.depaul.se350.hw1.flight.FlightFactory;


import java.util.ArrayList;
import java.util.List;

public class TravelManager {

    public static void main(String[] args) {
        try {
            Airline airline = new Airline("Spirit");
            Airport origin = new Airport("ORD");
            Airport destination = new Airport("DFW");

            CommercialFlight flight = new CommercialFlight(airline, origin, destination);

            System.out.println(flight);
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }

        List<CommercialFlight> aircraftInventory = new ArrayList();
        aircraftInventory.add(FlightFactory.createFlight("CommercialFlight"));
        aircraftInventory.add(FlightFactory.createFlight("CommercialFlight"));

        aircraftInventory.forEach(CommercialFlight -> System.out.println(CommercialFlight));
    }
}

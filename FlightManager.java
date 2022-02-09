package org.depaul.se350.hw1.flight;

import org.depaul.se350.hw1.exception.BadParameterException;
import org.depaul.se350.hw1.exception.NullParameterException;
import org.depaul.se350.simplefactory.aircraft.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class FlightManager implements Aircraft {
    private int id;
    private static FlightManager ourInstance;

    List<CommercialFlight> list = new ArrayList<>();

    public void createFlight() {

    }
    public static FlightManager getFlightByNumber() throws Exception {
        if (ourInstance == null) {
            ourInstance = new FlightManager();
        }

        return ourInstance;
    }
    private FlightManager() {

    }



}

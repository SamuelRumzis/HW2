package org.depaul.se350.hw1.flight;

import org.depaul.se350.hw1.exception.NullParameterException;
import org.depaul.se350.simplefactory.aircraft.Aircraft;
import org.depaul.se350.simplefactory.aircraft.HeavyTransportCraft;
import org.depaul.se350.simplefactory.aircraft.LightTransportCraft;


public class FlightFactory /* implements CommercialFlight */ {

    public CommercialFlight createFlight(String flight) throws NullParameterException {
        if (flight.equals("CommercialFlight"))
            return new CommercialFlight();
        else return null;
    }

    @Override
    public void fly() {

    }

    @Override
    public void start() {

    }
}
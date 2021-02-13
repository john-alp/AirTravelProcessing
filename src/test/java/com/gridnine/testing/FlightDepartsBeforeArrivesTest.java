package com.gridnine.testing;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.gridnine.testing.AbstractFlightTest.*;
import static org.junit.Assert.*;

public class FlightDepartsBeforeArrivesTest extends AbstractFlightTest {
 public FlightDepartsBeforeArrivesTest() {
     super(new FlightDepartsBeforeArrives());
 }
    @Before
    public void setUp() {
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
    }

    @Test
    public void filter() {
        final List<Flight> actualList = filterTest.filter(flights);
        final List<Flight> expectedList = Arrays.asList(flight1, flight2, flight4);
        assertEquals(expectedList, actualList);
        assertEquals(3, actualList.size());
    }
}
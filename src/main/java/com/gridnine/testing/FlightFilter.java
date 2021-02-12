package com.gridnine.testing;

import java.util.List;

public class FlightFilter {
    private Filter filter;
    private List<Flight> flights;

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public List<Flight> executeFilter() {
        return filter.filter(flights);
    }
}

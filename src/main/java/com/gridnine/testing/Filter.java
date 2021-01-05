package com.gridnine.testing;

import java.util.List;

public interface Filter {
    List<Flight> filter(List<Flight> flightList);
}

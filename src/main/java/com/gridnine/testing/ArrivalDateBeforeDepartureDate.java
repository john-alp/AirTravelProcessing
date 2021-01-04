package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

/**
 *   2. дата прилёта раньше даты вылета
 */

public class ArrivalDateBeforeDepartureDate implements Filter {



    @Override
    public void filter(List<Flight> flightList) {
        System.out.println("Исключить дату прилёта раньше даты вылета");

        flightList.forEach(flight -> flight.getSegments().stream()
        .filter(segment -> segment.getArrivalDate().isBefore(segment.getDepartureDate()))
                .forEach(segment -> System.out.println(segment.toString())));
    }
}

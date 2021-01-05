package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 2. дата прилёта раньше даты вылета
 */

public class FlightDepartsBeforeArrives implements Filter {

    @Override
    public List<Flight> filter(List<Flight> flightList) {
        List<Flight> resultList = new ArrayList<>();
        System.out.println();
        System.out.println("Исключить дату прилёта раньше даты вылета: ");
        for (Flight flights : flightList) {
            for (Segment segments : flights.getSegments()) {
                if (segments.getArrivalDate().isAfter(segments.getDepartureDate())) {
                    resultList.add(flights);
                    break;
                }
            }
        }
        return resultList;
    }
}

//        flightList.forEach(flight -> flight.getSegments().stream()
//        .filter(segment -> segment.getArrivalDate().isBefore(segment.getDepartureDate()))
//                .forEach(segment -> System.out.println(segment.toString())));


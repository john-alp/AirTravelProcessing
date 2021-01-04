package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

/**
 *  1. вылет до текущего момента времени
 */

public class DepartureToCurrentTime implements Filter {

    @Override
    public void filter(List<Flight> flightList) {
        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println("1. вылет до текущего момента времени");

        for (Flight flight : flightList) {
            for (Segment segment : flight.getSegments()) {
                if (segment.getArrivalDate() > timeNow.isBefore() )
            }
        }
        }
//        flightList.forEach(flight -> flight.getSegments()
//                .stream()
//                .filter(segment -> segment.getDepartureDate().isAfter(timeNow))
//                .limit(1)
//                .forEach(Segment -> System.out.println(Segment.toString())));

    }
}

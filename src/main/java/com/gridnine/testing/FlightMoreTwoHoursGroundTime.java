package com.gridnine.testing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 *  3. общее время, проведённое на земле превышает два часа (время на земле — это интервал между прилётом одного
 *     сегмента и вылетом следующего за ним)
 */

public class FlightMoreTwoHoursGroundTime implements Filter {

    LocalDateTime localDateTimeNow = LocalDateTime.now();


    @Override
    public List<Flight> filter(List<Flight> flightLists) {
        System.out.println();
        System.out.println("Общее время, проведённое на земле превышает два часа");

        for (Flight flight : flightLists) {
            for (Segment segment : flight.getSegments()) {

                timeDifference(segment.getArrivalDate(), segment.getDepartureDate());
            }
        }

        //flightList.forEach(flight -> flight.getSegments().stream().filter(segment -> segment.getArrivalDate()));
   return null;
    }

    public int timeDifference(LocalDateTime data1, LocalDateTime data2){
        return (int) ChronoUnit.HOURS.between(data1,data2);
    }

}

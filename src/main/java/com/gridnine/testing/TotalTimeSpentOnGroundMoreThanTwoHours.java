package com.gridnine.testing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TotalTimeSpentOnGroundMoreThanTwoHours implements Filter {

    LocalDateTime localDateTimeNow = LocalDateTime.now();
    LocalDateTime localDateTime3DaysUp = LocalDateTime.now().plusDays(3);
    LocalDateTime getLocalDateTime3DaysDown = LocalDateTime.now().minusDays(3);

    List<Flight> flightList = new ArrayList<>(new Flight(new Segment()));

    @Override
    public void filter(List<Flight> flightList) {
        System.out.println("Общее время, проведённое на земле превышает два часа");

        //flightList.forEach(flight -> flight.getSegments().stream().filter(segment -> segment.getArrivalDate()));
    }
    public String getOperator() {
        return "+";
    }

    public void getResult(LocalDate firstDate, LocalDate secondDate) {
        LocalDate result = firstDate.plusYears(secondDate.getYear()).
                plusMonths(secondDate.getMonthValue()).plusDays(secondDate.getDayOfMonth());
        System.out.println(result);
    }
}

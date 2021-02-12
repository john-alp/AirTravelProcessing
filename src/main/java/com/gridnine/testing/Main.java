package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        FlightFilter flightFilter = new FlightFilter();
        flightFilter.setFlights(flights);
        printFlightList(flights);

        flightFilter.setFilter(new UpcomingFlights());
        printFlightList(flightFilter.executeFilter());

        flightFilter.setFilter(new FlightDepartsBeforeArrives());
        printFlightList(flightFilter.executeFilter());

        flightFilter.setFilter(new FlightMoreTwoHoursGroundTime());
        printFlightList(flightFilter.executeFilter());
    }

    public static void printFlightList(List<Flight> list) {
        list.forEach(System.out::println);
        System.out.println("=================================");
    }


        //        FlightBuilder.createFlights().forEach(System.out::println);
//
//        Filter departureToTime = new DepartureToTime();
//        departureToTime.filter(FlightBuilder.createFlights()).forEach(System.out::println);
//
//        Filter flightDepartsBeforeArrives = new FlightDepartsBeforeArrives();
//        flightDepartsBeforeArrives.filter(FlightBuilder.createFlights()).forEach(System.out::println);
//
//        Filter flightMoreTwoHoursGroundTime = new FlightDepartsBeforeArrives();
//
//        ArrivalDateBeforeDepartureDate arrivalDateBeforeDepartureDate = new ArrivalDateBeforeDepartureDate();
//        arrivalDateBeforeDepartureDate.filter(FlightBuilder.createFlights());
//
//        TotalTimeSpentOnGroundMoreThanTwoHours moreThanTwoHours = new TotalTimeSpentOnGroundMoreThanTwoHours();
//        moreThanTwoHours.filter(FlightBuilder.createFlights());

    }
}

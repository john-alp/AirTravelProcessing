package com.gridnine.testing;

public class Main {
    public static void main(String[] args) {
        FlightBuilder.createFlights().forEach(System.out::println);

        Filter departureToTime = new DepartureToTime();
        departureToTime.filter(FlightBuilder.createFlights()).forEach(System.out::println);

        Filter flightDepartsBeforeArrives = new FlightDepartsBeforeArrives();
        flightDepartsBeforeArrives.filter(FlightBuilder.createFlights()).forEach(System.out::println);

        Filter flightMoreTwoHoursGroundTime = new FlightDepartsBeforeArrives();





//        ArrivalDateBeforeDepartureDate arrivalDateBeforeDepartureDate = new ArrivalDateBeforeDepartureDate();
//        arrivalDateBeforeDepartureDate.filter(FlightBuilder.createFlights());
//
//        TotalTimeSpentOnGroundMoreThanTwoHours moreThanTwoHours = new TotalTimeSpentOnGroundMoreThanTwoHours();
//        moreThanTwoHours.filter(FlightBuilder.createFlights());

    }
}

package com.gridnine.testing;

public class Main {
    public static void main(String[] args) {
        FlightBuilder.createFlights().forEach(System.out::println);

        DepartureToCurrentTime departureToCurrentTime = new DepartureToCurrentTime();
        departureToCurrentTime.filter(FlightBuilder.createFlights());

//        ArrivalDateBeforeDepartureDate arrivalDateBeforeDepartureDate = new ArrivalDateBeforeDepartureDate();
//        arrivalDateBeforeDepartureDate.filter(FlightBuilder.createFlights());

//        TotalTimeSpentOnGroundMoreThanTwoHours moreThanTwoHours = new TotalTimeSpentOnGroundMoreThanTwoHours();
//        moreThanTwoHours.filter(FlightBuilder.createFlights());

    }
}

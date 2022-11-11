package controller1;

import model1.FlightDetails;
import model1.ReservationDataBase;

import java.util.ArrayList;

public class DefaultFlights {
    private static int flightIdGenerator = 2200;
    private FlightDetails flightDetails;

    public static void flights() {
        ArrayList<String> flightRoute1 = new ArrayList<>();
        flightRoute1.add("CHENNAI");
        flightRoute1.add("BANGLORE");
        flightRoute1.add("HYDERABAD");
        ArrayList<String> flightRoute2 = new ArrayList<>();
        flightRoute2.add("CHENNAI");
        flightRoute2.add("MUMBAI");
        flightRoute2.add("DELHI");
        FlightDetails flight1 = new FlightDetails(flightIdGenerator++, "AIR INDIA", "11:00", "17:00", flightRoute1, 10,
                1200.0,10);
        ReservationDataBase.getInstance().addFlight(flight1);
        FlightDetails flight2 = new FlightDetails(flightIdGenerator++, "JET AIRWAYS", "09:00", "17:00", flightRoute2,
                10, 1800.0,10);
        ReservationDataBase.getInstance().addFlight(flight2);
        System.out.println(ReservationDataBase.getInstance().getFlightDB()+"\n");
    }

    public void init(String flightName, String depatureTime, String arrivalTime, ArrayList<String> flightRoutes,int flightCapacity, double flightFare,int tempSeatCount) {
        addFlight(flightName,depatureTime,arrivalTime,flightRoutes,flightCapacity,flightFare,tempSeatCount);

    }

    private void addFlight(String flightName, String depatureTime, String arrivalTime, ArrayList<String> flightRoutes, int flightCapacity, double flightFare,int tempSeatCount) {
        flightDetails = new FlightDetails(flightIdGenerator++, flightName, depatureTime, arrivalTime, flightRoutes,
                flightCapacity, flightFare,tempSeatCount);
        ReservationDataBase.getInstance().addFlight(flightDetails);
    }
}

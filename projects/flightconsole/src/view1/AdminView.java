package view1;

import controller1.DefaultFlights;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminView {
    private Scanner sc = new Scanner(System.in);
    private DefaultFlights defaultFlights;
    public void addNewFlight() {
        String flightName;
        String depatureTime;
        String arrivalTime;
        String route;
        double flightFare;
        int flightCapacity;
        int totalRoutes;

        System.out.println("[1] Enter flight name :");
        flightName = sc.next();
        System.out.println("[2] Enter flight depature time :");
        depatureTime = sc.next();
        System.out.println("[3] Enter flight arrival time :");
        arrivalTime = sc.next();
        System.out.println("[4] Enter the number of routes your flight going to travel :");
        totalRoutes = sc.nextInt();
        System.out.println("[5] Enter your routes :");
        ArrayList<String> flightRoutes = new ArrayList<>();
        for (int routeNumber = 1; routeNumber <= totalRoutes; routeNumber++) {
            System.out.println("Enter Route " + routeNumber + " :");
            route = sc.next();
            flightRoutes.add(route);
        }
        System.out.println("[6] Enter your flight fare :");
        flightFare = sc.nextDouble();
        System.out.println("[7] Enter your flight capacity :");
        flightCapacity = sc.nextInt();
        System.out.println("[8] Enter tempSeatCount");
        int tempSeatCount = sc.nextInt();
        defaultFlights=new DefaultFlights();
        defaultFlights.init(flightName, depatureTime, arrivalTime, flightRoutes, flightCapacity, flightFare,tempSeatCount);


    }
}

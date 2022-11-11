package model1;

import java.util.ArrayList;

public class FlightDetails {
    private int flightNumber;
    private String flightName;
    private String depatureTime;
    private String arrivalTime;
    private ArrayList<String> flightRoutes;
    private  int seats;
    private int tempSeatCount;
    private double fare;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public FlightDetails(int flightNumber, String flightName, String depatureTime, String arrivalTime,
                         ArrayList<String> flightRoutes, int seats, double fare, int tempSeatCount) {
        super();
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.depatureTime = depatureTime;
        this.arrivalTime = arrivalTime;
        this.flightRoutes = flightRoutes;
        this.seats = seats;
        this.fare = fare;
        this.tempSeatCount = tempSeatCount;
    }

    public String getFlightName() {
        return flightName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(String depatureTime) {
        this.depatureTime = depatureTime;
    }
    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public ArrayList<String> getFlightRoutes() {
        return flightRoutes;
    }

    public void setFlightRoutes(ArrayList<String> flightRoutes) {
        this.flightRoutes = flightRoutes;
    }

    public int getSeats() {
        return seats;
    }
    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public int getTempSeatCount() {
        return tempSeatCount;
    }

    public void setTempSeatCount(int tempSeatCount) {
        this.tempSeatCount = tempSeatCount;
    }

    @Override
    public String toString() {
        return "FlightDetails{" +
                "flightNumber=" + flightNumber +
                ", flightName='" + flightName + '\'' +
                ", depatureTime='" + depatureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", flightRoutes=" + flightRoutes +
                ", seats=" + seats +
                ", fare=" + fare +
                '}';
    }
}


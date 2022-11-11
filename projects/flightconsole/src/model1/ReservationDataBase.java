package model1;

import java.util.ArrayList;
import java.util.HashMap;

public class ReservationDataBase {
    private static ReservationDataBase reservationDB=null;

    private HashMap<Long, PassengerDetails> passengerSignUpDB;
    private HashMap<Integer, FlightDetails> flightDB;
    private HashMap<Integer, FlightTicket> flightTicketDB;

    private ReservationDataBase() {
        add();
    }
    private void add() {
        passengerSignUpDB = new HashMap<>();
        flightDB = new HashMap<>();
        flightTicketDB = new HashMap<>();
    }


    public static ReservationDataBase getInstance() {
        if (reservationDB == null) {
            reservationDB = new ReservationDataBase();
        }
        return reservationDB;
    }

    public void addPassenger(PassengerDetails passengerDetails) {
        this.passengerSignUpDB.put(passengerDetails.getId(), passengerDetails);
    }
    public HashMap<Long, PassengerDetails> getPassengerSignUpDB() {
        return passengerSignUpDB;
    }

    public void addFlight(FlightDetails flightDetails) {
        this.flightDB.put(flightDetails.getFlightNumber(), flightDetails);
    }
public void addFlightTicket(FlightTicket flightTicket)
{
    this.flightTicketDB.put(flightTicket.getPnrNo(),flightTicket);
}
    public HashMap<Integer, FlightDetails> getFlightDB() {
        return flightDB;
    }
    public HashMap<Integer, FlightTicket> getFlightTicketDB() {
        return flightTicketDB;
    }
}


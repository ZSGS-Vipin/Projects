package controller1;

import model1.FlightDetails;
import model1.FlightTicket;
import model1.ReservationDataBase;

import java.util.HashMap;

public class BookingController {
    private static int bookinCount =0;
    String ticketInfo;
    public String  bookingCheck(FlightTicket flightTicket) {
            System.out.println("after while loop");
            if(flightTicket.getTotalBooking()>3)
            {
                return "As you reached the limit you cannot book furthur";
            }
            else
            {
                    String departure = flightTicket.getDepartureCity();
                    String arrival   = flightTicket.getArrivalCity();
                     int temp = flightTicket.getFlightNo();
                if(ReservationDataBase.getInstance().getFlightDB().containsKey(temp)&&
                   ReservationDataBase.getInstance().getFlightDB().get(flightTicket.getFlightNo()).getFlightRoutes().contains(departure)&&
                   ReservationDataBase.getInstance().getFlightDB().get(flightTicket.getFlightNo()).getFlightRoutes().contains(arrival)&&
                   ReservationDataBase.getInstance().getFlightDB().get(flightTicket.getFlightNo()).getSeats()>=0)
                    {
                        ticketInfo =  flightTicket.toString();
                       ReservationDataBase.getInstance().getFlightDB().get(flightTicket.getFlightNo()).setSeats(Math.abs(flightTicket.getTempSeatCount())-ReservationDataBase.getInstance().getFlightDB().get(flightTicket.getFlightNo()).getSeats());
                       ReservationDataBase.getInstance().addFlightTicket(flightTicket);
                       return ticketInfo;
                    }
                }
        return "sorry details are invalid";
    }
    public String cancelBooking(FlightTicket flightTicket)
    {
        if(ReservationDataBase.getInstance().getFlightTicketDB().containsKey(flightTicket.getPnrNo())&&
           ReservationDataBase.getInstance().getFlightTicketDB().get(flightTicket.getPnrNo()).getArrivalCity().equalsIgnoreCase(flightTicket.getArrivalCity())&&
           ReservationDataBase.getInstance().getFlightTicketDB().get(flightTicket.getPnrNo()).getDepartureCity().equalsIgnoreCase(flightTicket.getDepartureCity()))
        {
            ReservationDataBase.getInstance().getFlightDB().get(flightTicket.getFlightNo()).setSeats(Math.abs(flightTicket.getTempSeatCount())+ReservationDataBase.getInstance().getFlightDB().get(flightTicket.getFlightNo()).getSeats());
            ReservationDataBase.getInstance().getFlightTicketDB().remove(flightTicket.getPnrNo());
            return "successfully cancelled";
        }
        return "enter the details correctly";
    }

}

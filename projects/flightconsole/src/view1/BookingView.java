package view1;

import controller1.BookingController;
import model1.FlightDetails;
import model1.FlightTicket;
import model1.ReservationDataBase;

import java.util.Scanner;

public class BookingView {
    BookingController bookingController = new BookingController();
    private static int pnrNo=1000;
    private static int totalBookingCount = 0;
    Scanner scanner  = new Scanner(System.in);
    public void booking()
    {
        System.out.println("Enter the neccessary details for booking");
        System.out.println("Enter the departure");
        String departure = scanner.next();
        System.out.println("Enter the arrivial");
        String arrival = scanner.next();
        System.out.println("enter the flight no");
        int flightNo = scanner.nextInt();
        System.out.println("Enter the seats you want to book");
        int tempSeatCount = scanner.nextInt();
        FlightTicket flightTicket = new FlightTicket(++pnrNo,arrival,departure,flightNo,++totalBookingCount,tempSeatCount);
        System.out.println(bookingController.bookingCheck(flightTicket));
    }
    public void cancelBooking()
    {
        System.out.println("Enter below details correctly to cancel your tickets");
        System.out.println("Enter the PNR number");
        int pnr = scanner.nextInt();
        System.out.println("Enter the departure");
        String departure = scanner.next();
        System.out.println("Enter the arrivial");
        String arrival = scanner.next();
        System.out.println("enter the flight no");
        int flightNo = scanner.nextInt();
        System.out.println("Enter the seats you want to book");
        int tempSeatCount = scanner.nextInt();
        System.out.println("Enter the number of seats you booked");
        FlightTicket flightTicket = new FlightTicket(pnr,arrival,departure,flightNo,--totalBookingCount,tempSeatCount);
        System.out.println(bookingController.cancelBooking(flightTicket));
    }
    public void search()
    {
        boolean loop = true;
        while(loop) {
            System.out.println("1.Search by flight id");
            System.out.println("2.Search by routes");
            System.out.println("3.exit");
            int choice = scanner.nextInt();
            int flightId = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    if(ReservationDataBase.getInstance().getFlightDB().containsKey(flightId))
                        System.out.println(ReservationDataBase.getInstance().getFlightDB().get(flightId));
                    break;
                case 2:
                    String routes = scanner.next();
                    if(ReservationDataBase.getInstance().getFlightDB().containsValue(routes))
                        System.out.println(ReservationDataBase.getInstance().getFlightDB().get(flightId));
                    break;
                case 3:
                    loop=false;
                    break;
            }
        }

    }
}

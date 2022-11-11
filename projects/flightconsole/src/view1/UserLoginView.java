package view1;
import controller1.DefaultFlights;
import controller1.Main;
import controller1.userController;
import jdk.swing.interop.SwingInterOpUtils;
import model1.PassengerDetails;
import model1.FlightDetails;
import model1.PassengerDetails;
import model1.ReservationDataBase;

import java.util.Scanner;

public class UserLoginView {
    ReservationDataBase reservationDataBase;
    private static long id = 2000;
    Scanner scan = new Scanner(System.in);
    public PassengerDetails signUpInfo()
    {
        System.out.println("Enter your name");
        String name = scan.next();
        System.out.println("Enter your password");
        String password = scan.next();
        if(new userController().isValid(password))
        {
            password=new userController().getEncrypted(password);
        }
        System.out.println("Enter your mobile");
        String phone = scan.next();
        PassengerDetails passenger = new PassengerDetails(name,password,++id,phone);
        ReservationDataBase.getInstance().addPassenger(passenger);
        return passenger;
    }
    public void loginInfo()
    {
        System.out.println("Enter your id");
        long id = scan.nextLong();
        if(ReservationDataBase.getInstance().getPassengerSignUpDB().containsKey(id))
        {
            System.out.println("Welcome Passenger " + ReservationDataBase.getInstance().getPassengerSignUpDB().get(id).getName());
            boolean loop = true;
            while(loop)
            {
                System.out.println("1.To View Available Flights");
                System.out.println("2.To search flights");
                System.out.println("3.To Book Flight");
                System.out.println("4.To Cancel A flight");
                System.out.println("5.Exit");
                int userchoice= scan.nextInt();
                switch (userchoice)
                {
                    case 1:
                        new DefaultFlights().flights();
                        break;
                    case 2:
                        new BookingView().search();
                        break;
                    case 3:
                        new BookingView().booking();
                        break;
                    case 4:
                        new BookingView().cancelBooking();
                        break;
                    case 5:
                        loop=false;
                        break;
                }
            }
        }
        else
        {
            System.out.println("Invalid Credintials");
        }
    }
}



package controller1;

import model1.FlightDetails;
import model1.PassengerDetails;
import model1.ReservationDataBase;
import view1.UserLoginView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
static UserLoginView userLoginView;
    public static void main(String[] args) {
         userLoginView = new UserLoginView();
        Scanner scan = new Scanner(System.in);
        System.out.println("AIRLINE RESERVATION");
        boolean loop = true;
        while(loop)
        {
            try
            {
                System.out.println("1.REGISTER");
                System.out.println("2.LOGIN");
                System.out.println("3.EXIT");
                byte choice = scan.nextByte();
                switch (choice)
                {
                    case 1:
                        System.out.println(userLoginView.signUpInfo());
                        break;
                    case 2:
                        userLoginView.loginInfo();
                        break;
                    case 3:
                        loop=false;
                        break;
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

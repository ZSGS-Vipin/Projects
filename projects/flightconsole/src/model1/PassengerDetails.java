package model1;

import java.util.ArrayList;

public class PassengerDetails {
    private String name;
    private String password;
    private long id;
    private String phone;

    public PassengerDetails(String name, String password, long id, String phone) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.phone = phone;
    }


    public PassengerDetails(String passengerName) {
        this.name = passengerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                '}';
    }
}

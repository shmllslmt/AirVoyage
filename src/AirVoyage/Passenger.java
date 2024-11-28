package AirVoyage;

import java.util.ArrayList;

public class Passenger {
    private String passengerID;
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private ArrayList<Booking> BookingList = new ArrayList<Booking>();

    public Passenger() {
        this("01", "Lou Hong Ee", 80, "D230122B@sc.edu.my", "012-345 6789");
    }

    public Passenger(String passengerID, String name, int age, String email, String phoneNumber) {
        this.passengerID = passengerID;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerID='" + passengerID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", BookingList=" + BookingList +
                '}';
    }
}

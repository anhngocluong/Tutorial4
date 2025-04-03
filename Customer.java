package pack;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Event> reservationList;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.reservationList = new ArrayList<>();
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public void addReservation(Event event) {
        reservationList.add(event);
    }
    public void cancelReservations(Event event) {
        reservationList.remove(event);
    }

    public void displayReservations() {
        if (reservationList.isEmpty()) {
            System.out.println("No reservations found");
        }
        else {
            for (Event event : reservationList) {
                System.out.println(event);
            }
        }
    }
}

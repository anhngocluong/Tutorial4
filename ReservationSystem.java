package pack;

import java.util.ArrayList;

public class ReservationSystem {
    private ArrayList<Event> events;
    private ArrayList<Customer> customers;

    public ReservationSystem(){
        events = new ArrayList<>();
        customers = new ArrayList<>();
    }
    public void addEvent(Event event){
        events.add(event);
    }
    public void addEvent(String name, double price){
        events.add(new Event(name, price));
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void addCustomer(String firstName, String lastName){
        customers.add(new Customer(firstName, lastName));
    }
    public void makeReservation (Customer customer, Event event){
        if (event.reserveSeat()){
            customer.addReservation(event);
        }
        else {
            System.out.println("Reservation failed");
        }
    }

    public Event findEvent (String name){
        for (Event e : events){
            if (e.getName().equalsIgnoreCase(name)){
                return e;
            }
        }
        return null;
    }

    public void changeEventPrice (String name, double newPrice){
        Event event = findEvent(name);
        if (event != null){
            event.setPrice(newPrice);
        }
    }
}

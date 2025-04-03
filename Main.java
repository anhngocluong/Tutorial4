package pack;

public class Main {
    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem();

        Event concert = new Event("Symphony Concert", 120.0);
        Event threater = new Event("Hamlet", 85.0);
        system.addEvent(concert);
        system.addEvent(threater);

        Customer customer1 = new Customer("John", "Smith", "john@example.com");
        Customer customer2 = new Customer("Anna", "Johnson", "anna@example.com");
        system.addCustomer(customer1);
        system.addCustomer(customer2);

        system.makeReservation(customer1, concert);
        system.makeReservation(customer2, threater);
        system.makeReservation(customer2, concert);

        System.out.println("Reservations for customer " + customer1.getFirstName() + " " + customer1.getLastName() + ":");
        customer1.displayReservations();

        Event concertRef = system.findEvent("Symphony Concert");
        System.out.println("Changing concert price from " + concertRef.getPrice() + " to 150.0");
        concertRef.setPrice(150.0);

        System.out.println("Reservations for customer" + customer1.getFirstName() + " " + customer1.getLastName() + ":");
        customer1.displayReservations();

        System.out.println("Reservations for customer " + customer2.getFirstName() + " " + customer2.getLastName() + ":");
        customer2.displayReservations();

        System.out.println(customer1.getFirstName() + " cancels theater reservation:");
        customer1.cancelReservations(threater);
        customer1.displayReservations();

        System.out.println("Available seats for the concert: " + concert.getAvailableSeats() + " out of " + concert.getMaxNumberOfSeats());
    }
}

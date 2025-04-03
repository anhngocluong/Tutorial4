package pack;

public class Event {
    private String name;
    private String date;
    private String location;
    private int maxNumberOfSeats;
    private int availableSeats;
    private double price;

    //Constructors
    public Event (String name, double price){
        this.name = name;
        this.price = price;
    }
    public Event (String name, double price, String date){
        this.name = name;
        this.price = price;
        this.date = date;
    }
    public Event (String name, double price, String date, String location){
        this.name = name;
        this.price = price;
        this.date = date;
        this.location = location;
        this.maxNumberOfSeats = 100;
        this.availableSeats = 100;
    }

    // getters and setters
    public String getName() {return name;}
    public String getDate() {return date;}
    public String getLocation() {return location;}
    public int getMaxNumberOfSeats() {return maxNumberOfSeats;}
    public int getAvailableSeats() {return availableSeats;}
    public double getPrice() {return price;}
    public double setPrice(double price){this.price = price;
        return price;
    }
    public boolean reserveSeat(){
        if (availableSeats > 0){
            availableSeats--;
            return true;
        }
        return false;
    }
    public String toString(){
        return name + " on " + date + " at " + location + ", Price: $" + price + ", Seats left: " + availableSeats;
    }
}

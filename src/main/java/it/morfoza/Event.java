package it.morfoza;
public class Event {

    private String eventName;
    private String city;
    private String date;
    private double price;
    private String dance;

    public Event (String eventName, String city, String date, double price, String dance) {
        this.eventName = eventName;
        this.city = city;
        this.date = date;
        this.price = price;
        this.dance = dance;
    }

    public String toString() {
        return eventName + city + date + " Cena " + price + " Taniec " + dance;
    }

    public boolean isFree() {
        if (this.price == 0) {
            return true;
        } else {
            return false;
        }
    }



}

package it.morfoza;

import java.text.SimpleDateFormat;

public class Event {

    private String eventName;
    private String city;
    private SimpleDateFormat date;
    private double price;
    private String dance;

    public Event (String eventName, String city, SimpleDateFormat date, double price, String dance) {
        this.eventName = eventName;
        this.city = city;
        this.date = date;
        this.price = price;
        this.dance = dance;
    }

    public String getEventName() {return eventName;}
    public String getCity() {return city;}
    public double getPrice() {return price;}
    public String getDance() {return dance;}
    public SimpleDateFormat getDate() {return date;}

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

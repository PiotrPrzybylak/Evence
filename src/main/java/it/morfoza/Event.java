package it.morfoza;

import java.text.SimpleDateFormat;

public class Event {

    private String eventName;
    private String city;
    private String date;
    private Money price;
    private String dance;

    public Event (String eventName, String city, String  date, double price, String dance) {
        this.eventName = eventName;
        this.city = city;
        this.date = date;
        this.price = new Money(price);
        this.dance = dance;
    }

    public String getEventName() {return eventName;}
    public String getCity() {return city;}
    public double getPrice() {return price.getDoubleValue();}
    public String getDance() {return dance;}
    public String getDate() {return date;}

    public String toString() {
        return eventName + city + date + " Price: " + price + " Dance: " + dance;
    }

    public boolean isFree() {
        return price.getDoubleValue() == 0;
    }



}

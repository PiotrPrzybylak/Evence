package it.morfoza;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EventRowMapper implements RowMapper<Event> {

    @Override
    public Event mapRow(ResultSet rs, int rowNum) throws SQLException {
        String eventName = rs.getString("eventName");
        String city = rs.getString("city");
        String dance = rs.getString("dance");
        Double price = rs.getDouble("price");
        String date= rs.getString("date");
        return new Event(eventName, city, date, price, dance );
    }
}

package it.morfoza;

import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Component
@Profile("!demo")
public class DatabaseEventRepository implements EventRepository {

    public DatabaseEventRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;

    private RowMapper<Event> mapper = new RowMapper<Event>() {
        @Override
        public Event mapRow(ResultSet rs, int i) throws SQLException {
            String eventName = rs.getString("eventName");
            String city = rs.getString("city");
            String dance = rs.getString("dance");
            BigDecimal price = rs.getBigDecimal("price");
            String date= rs.getString("date");
            return new Event(eventName, city, date, new Money(price), dance );
        }
    };

    @Override
    public List<Event> getAllEvents() {
        return jdbcTemplate.query("SELECT eventname, city, dance, id, price, date FROM events",
                mapper);
    }

    @Override
    public List<Event> getByDance(String danceName) {
        return jdbcTemplate.query("SELECT eventname, city, dance, id, price, date FROM events WHERE dance LIKE ?",
                mapper, "%" + danceName + "%");
    }

}

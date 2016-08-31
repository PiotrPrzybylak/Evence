package it.morfoza;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DatabaseEventRepository implements EventRepository {

    public DatabaseEventRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Event> getAllEvents() {

        return jdbcTemplate.query("SELECT eventname, city, dance, id, price, date FROM events",
                new EventRowMapper());
    }

    @Override
    public Event getByDance(String danceName) {
        return jdbcTemplate.queryForObject("SELECT eventname, city, dance, id, price, date FROM events WHERE dance LIKE ?",
                new EventRowMapper(), "%" + danceName + "%");
    }

}

package it.morfoza;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class InMemoryEventRepository implements EventRepository {
    private List<Event> events = new ArrayList<>();
    @Override
    public List<Event> getAllEvents() {
        return events;
    }

    @Override
    public Event getByDance(String danceName) {
        return null;
    }

    @Override
    public boolean danceFormIsEmpty(String form) {
        return false;
    }


    public boolean cityFormIsEmpty(String city) {
        if (city != null) {
            return true;
        } else
        return false;
    }
}

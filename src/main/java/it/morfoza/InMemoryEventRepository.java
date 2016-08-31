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


    public boolean cityFormIsEmpty(String city) {
        return city != null;
    }
}

package it.morfoza;
import java.util.ArrayList;
import java.util.List;

public class InMemoryEventsRepository implements EventsRepository {
    private List<Event> events = new ArrayList<>();
    @Override
    public List<Event> getAllEvents() {
        return events;
    }
}

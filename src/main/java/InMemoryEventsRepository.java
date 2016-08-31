import java.util.ArrayList;
import java.util.List;

public class InMemoryEventsRepository implements EventsRepository {
    private List<Event> events = new ArrayList<Event>();
    @Override
    public List<Event> getAllEvents() {
        return events;
    }
}

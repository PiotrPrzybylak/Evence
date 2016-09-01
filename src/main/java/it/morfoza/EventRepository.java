package it.morfoza;
import java.util.List;

public interface EventRepository {

    List<Event> getAllEvents();

    List<Event> getByDance(String danceName);
}

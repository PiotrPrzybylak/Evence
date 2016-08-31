package it.morfoza;
import java.util.List;

public interface EventRepository {
    List<Event> getAllEvents();
    boolean cityFormIsEmpty (String city );
}

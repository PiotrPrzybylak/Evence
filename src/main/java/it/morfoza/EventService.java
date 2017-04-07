package it.morfoza;

import java.util.List;

public interface EventService {
    List<Event> getByDance(String danceName);
}

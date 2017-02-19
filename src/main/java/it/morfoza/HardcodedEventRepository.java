package it.morfoza;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Profile("demo")
public class HardcodedEventRepository implements EventRepository {

    private List<Event> eventList = new ArrayList<>();

    public HardcodedEventRepository() {
        eventList.add(new Event("Salsa Dance", "Warszawa", "2016-12-03", new Money(0), "salsa"));
        eventList.add(new Event("Jazz", "Wrocław", "12.10", new Money(120), "jazz"));
        eventList.add(new Event("Dupa Dance", "Łódź", "09.12", new Money(666), "salsa"));
        eventList.add(new Event("Tańczy się tylko raz", "Kraków", "22.10", new Money(0), "hip-hop"));
    }

    @Override
    public List<Event> getAllEvents() {
        return eventList;
    }

    @Override
    public List<Event> getByDance(String danceName) {
        List<Event> chosenEventList =new ArrayList<>();
        for (Event event : eventList) {
            if (event.getDance().equals(danceName)) {
                chosenEventList.add(event);
            }
        }
        return chosenEventList;
    }

}

package it.morfoza;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michalina on 31/08/16.
 */
public class HardcodedEvenceAdvisor implements EventRepository {

    private List<Event> eventList = new ArrayList<>();


    public HardcodedEvenceAdvisor() {
        eventList.add(new Event("Salsa Dance", "Warszawa", "2016-12-03", 0, "salsa"));
        eventList.add(new Event("Jazz", "Wrocław", "12.10", 120, "jazz"));
        eventList.add(new Event("Dupa Dance", "Łódź", "09.12", 666, "luźny styl"));
        eventList.add(new Event("Tańczy się tylko raz", "Kraków", "22.10", 0, "hip-hop"));

    }

    @Override
    public List<Event> getAllEvents() {

        return eventList;
    }

    @Override
    public Event getByDance(String danceName) {

        for (Event event : eventList) {
            if (event.getDance().equals(danceName)) {
                return event;
            }
        }
        throw new RuntimeException();
    }

    @Override
    public boolean danceFormIsEmpty(String form) {
        return false;
    }


    public Event getEvent(String danceName) {
        HardcodedEvenceAdvisor hardcodedEvenceAdvisor=new HardcodedEvenceAdvisor();
        return hardcodedEvenceAdvisor.getByDance(danceName);
    }
}

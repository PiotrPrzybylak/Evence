package it.morfoza;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Component
@Profile("demo")
public class HardcodedEventRepository implements EventRepository {

    private List<Event> eventList = new ArrayList<>();

    public HardcodedEventRepository() {
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
    public List<Event> getByDance(String danceName) {
        List<Event> chosenEventList =new ArrayList<>();
        for (Event event : eventList) {
            if (event.getDance().equals(danceName)) {
                chosenEventList.add(event);
                return chosenEventList;
            }
        }
        throw new RuntimeException();
    }

    public List<Event> getEvent(String danceName) {
        HardcodedEventRepository hardcodedEvenceAdvisor=new HardcodedEventRepository();
        return hardcodedEvenceAdvisor.getByDance(danceName);
    }

    public void daneEventu(String balanga, String warszawa, int i, String salsa, String s, Model model) {
    }
}

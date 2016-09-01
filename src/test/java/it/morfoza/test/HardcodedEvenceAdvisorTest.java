
package it.morfoza.test;
import it.morfoza.*;
import org.junit.Test;
import org.springframework.ui.Model;

import java.awt.*;
import java.awt.Event;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HardcodedEvenceAdvisorTest {
    private List<Event> eventList = new ArrayList<>();

    @Test
    public void shouldDisplayMatchingEvents(){
//Given
        EventRepository eventRepository=mock(EventRepository.class);
        Event eventList=mock(Event.class);
        HardcodedEvenceAdvisor sut= new HardcodedEvenceAdvisor ();

        Model model=mock(Model.class);
        Event event=mock(Event.class);
        EventFactory eventFactory=mock(EventFactory.class);
        Event expectedEvent=mock(Event.class);

        when(eventFactory.getByDance("balanga", "Warszawa", 100, "salsa", "2016")).thenReturn(expectedEvent);
        //When
        sut.daneEventu("balanga", "Warszawa", 100, "salsa", "2016", model);


    }

}

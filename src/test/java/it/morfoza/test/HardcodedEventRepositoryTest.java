
package it.morfoza.test;

import it.morfoza.Event;
import it.morfoza.HardcodedEventRepository;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class HardcodedEventRepositoryTest {

    @Test
    public void shouldDisplayMatchingEvents(){

        //Given
        HardcodedEventRepository sut= new HardcodedEventRepository();

        //When
        List<Event> events = sut.getByDance("salsa");

        // Then
        assertThat(events).hasSize(1);
        Event event1 = events.get(0);
        assertThat(event1.getEventName()).isEqualTo("Salsa Dance");
    }

}

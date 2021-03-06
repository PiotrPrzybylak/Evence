
package it.morfoza.test;

import it.morfoza.Event;
import it.morfoza.HardcodedEventRepository;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class HardcodedEventRepositoryTest {

    @Test
    public void shouldDisplayMatchingEvents() {

        // Given
        HardcodedEventRepository sut = new HardcodedEventRepository();

        // When
        List<Event> events = sut.getByDance("jazz");

        // Then
        assertThat(events).hasSize(1);
        Event event1 = events.get(0);
        assertThat(event1.getEventName()).isEqualTo("Jazz");
    }

    @Test
    public void shouldReturnEmptyList() {
        // Given
        HardcodedEventRepository sut = new HardcodedEventRepository();

        // When
        List<Event> result = sut.getByDance("tralalala");

        // Then
        assertThat(result).hasSize(0);
    }

    @Test
    public void shouldDisplayTwoMatchingEvents() {

        // Given
        HardcodedEventRepository sut = new HardcodedEventRepository();

        // When
        List<Event> events = sut.getByDance("salsa");

        // Then
        assertThat(events).hasSize(2);
    }

}

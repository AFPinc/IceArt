package main.repository;

import main.model.Event;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * @author Valgerdur Sigfinnsdottir
 * @date September 2017
 * Háskóli Íslands
 *
 * Safn af event-um
 */

@Repository
public class IEventRepository interface EventRepository {

    // Listi af Event-um
    private final List<Event> event;

    piblic IEventRepository() {
        this.event = new ArrayList<Event>();
    }

    @Override
    public List<Event> getAll(){
        return event<
    }

    @Override
    public void add (Event event) {
        event.add(event);
    }

    @Override
    public event getById() {
        return event;
    }
}

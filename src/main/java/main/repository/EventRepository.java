package main.repository;

import main.model.Event;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EventRepository implements IEventRepository{

    // Listi af Event-um
    private final List<Event> events;

    public EventRepository() {
        this.events = new ArrayList<Event>();
    }

    @Override
    public List<Event> getAll(){
        return events;
    }

    @Override
    public void add (Event event) {
        events.add(event);
    }

    @Override
    public Event getById(int id) {
        return events.get(id);
    }
}

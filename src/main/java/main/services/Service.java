package main.services;

import main.model.Event;
import main.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;


@org.springframework.stereotype.Service
public class Service implements IService{

    @Autowired
    EventRepository eventRepo;

    @Override
    public void addEvent(Event event) {
        eventRepo.add(event);
    }

    @Override
    public Event getEventById(int id) {
        return eventRepo.getById(id);
    }
}

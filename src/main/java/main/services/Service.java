package main.services;

import main.model.Event;
import main.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Valgerdur Sigfinnsdottir
 * @date September 2017
 * Háskóli Íslands
 *
 * Þjónustuklasi.
 */

@org.springframework.stereotype.Service
public class Service implements IService{

    @Autowired
    EventRepository eventRepo;

    @Override
    public int addEvent(Event event) {
        return eventRepo.add(event);
    }

    @Override
    public Event getEventById(int id) {
        return eventRepo.getById(id);
    }
}

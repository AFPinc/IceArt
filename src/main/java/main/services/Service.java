package main.services;

import main.model.Event;
import main.repository.IEventRepository;
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
    IEventRepository eventRepo;

    @Override
    public Event addEvent(Event event) {
        return eventRepo.save(event);
    }

    @Override
    public Event getEventById(Long id) {
        return eventRepo.findOne(id);
    }
}

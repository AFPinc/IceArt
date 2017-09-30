package main.services;

import main.model.Event;

public interface IService {
    Event addEvent(Event event);

    Event getEventById(Long id);
}

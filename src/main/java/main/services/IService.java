package main.services;

import main.model.Event;

public interface IService {
    int addEvent(Event event);

    Event getEventById(int id);
}

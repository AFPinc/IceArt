package main.services;

import main.model.Event;

public interface IService {
    void addEvent(Event event);

    Event getEventById(int id);
}

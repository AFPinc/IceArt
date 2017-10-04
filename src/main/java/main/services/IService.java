package main.services;

import main.model.Artist;
import main.model.Event;
import main.model.Location;

import java.util.List;

public interface IService {
    Event addEvent(Event event);

    Event getEventById(Long id);

    List<Event> getAllEvents();

    Event getEventByTitle(String title);

    Location addLocation(Location location);

    List<Location> getAllLocations();

    Location getLocationById(Long id);

    Artist addArtist(Artist artist);

    List<Artist> getAllArtist();

    Artist getArtistById(Long id);
}

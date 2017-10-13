package main.services;

import main.model.Artist;
import main.model.Event;
import main.model.Location;
import main.repository.IArtistRepository;
import main.repository.IEventRepository;
import main.repository.ILocationRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

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
    @Autowired
    ILocationRepositroy locationRepo;
    @Autowired
    IArtistRepository artistRepo;

    @Override
    public Event addEvent(Event event) {
        return eventRepo.save(event);
    }

    @Override
    public Event getEventById(Long id) {
        return eventRepo.findOne(id);
    }

    @Override
    public List<Event> getEventByTitle(String title) {
        return eventRepo.findByTitle(title);
    }

    @Override
    public List<Event> getTop10Events() {
        return eventRepo.findTop10();
    }

    @Override
    public List<Event> getAllEvents() { return eventRepo.findAll(); }

    @Override
    public Location addLocation(Location location) {
        return locationRepo.save(location);
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepo.findAll();
    }

    @Override
    public Location getLocationById(Long id) {
        return locationRepo.findOne(id);
    }

    @Override
    public Artist addArtist(Artist artist) {
        return artistRepo.save(artist);
    }

    @Override
    public List<Artist> getAllArtist() {
        return artistRepo.findAll();
    }

    @Override
    public Artist getArtistById(Long id) {
        return artistRepo.findOne(id);
    }

}

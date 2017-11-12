package main.services;

import main.model.Artist;
import main.model.Event;
import main.model.Location;
import main.model.Category;
import main.model.User;
import main.repository.IArtistRepository;
import main.repository.IEventRepository;
import main.repository.ILocationRepository;
import main.repository.ICategoryRepository;
import main.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

 /**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhansdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir

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
    ILocationRepository locationRepo;
    @Autowired
    IArtistRepository artistRepo;
    @Autowired
    ICategoryRepository categoryRepo;
    @Autowired
    IUserRepository userRepo;

    @Override
    public Event addEvent(Event event) {
        return eventRepo.save(event);
    }

    @Override
    public Event getEventById(Long id) {
        return eventRepo.findOne(id);
    }

    @Override
    public List<Event> getTop10Events() {
        return eventRepo.findTop10();
    }

    @Override
    public List<Event> search(String title, Long category_id, Date dateBegin, Date dateEnd) {
        return eventRepo.findBySearchCritera(title, category_id, dateEnd, dateBegin);
    }

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

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepo.findOne(id);
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }

     @Override
     public User getUserByUserName(String username) {
         return userRepo.findTopByUsername(username);
     }
 }

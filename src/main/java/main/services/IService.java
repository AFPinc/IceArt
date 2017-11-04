package main.services;

import main.model.Artist;
import main.model.Event;
import main.model.Location;
import main.model.Category;
import main.model.User;

import java.util.Date;
import java.util.List;

public interface IService {
    /**
     * fall sem vistar event
     * @param event
     * @return
     */
    Event addEvent(Event event);

    /**
     * Fall sem nær í event eftir auðkenni
     * @param id
     * @return
     */
    Event getEventById(Long id);

    /**
     * Fall sem nær í alla eventa í kerfinu
     * @return
     */
    List<Event> getAllEvents();

    /**
     * fall sem nær í eventa eftir titli
     * @param title
     * @return
     */
    List<Event> getEventByTitle(String title);

    /**
     * Fall sem nær í 10 event
     * @return Listi af event
     */
    List<Event> getTop10Events();

    /**
     * fall sem nær í eventa eftir titli og flokk
     * @param title
     * @param category_id
     * @return
     */

    List<Event> search(String title, Long category_id, Date dateBegin, Date dateEnd, Date timeBegin, Date timeEnd);

    List<Event> searchLess(String title, Long category_id, Date dateBegin, Date dateEnd);

    /**
     * fall sem vistar staðsetningu
     * @param location
     * @return
     */
    Location addLocation(Location location);

    /**
     * fall sem nær í allar staðsetningar
     * @return
     */
    List<Location> getAllLocations();

    /**
     * Fall sem nær í staðsetningur eftir auðkenni
     * @param id
     * @return
     */
    Location getLocationById(Long id);

    /**
     * fall sem vistar artist
     * @param artist
     * @return
     */
    Artist addArtist(Artist artist);

    /**
     * fall sem nær í alla artista
     * @return
     */
    List<Artist> getAllArtist();

    /**
     * fall sem nær í artista eftir auðkenni
     * @param id
     * @return
     */
    Artist getArtistById(Long id);

    /**
     * fall sem nær í allar categories
     * @return
     */
    List<Category> getAllCategories();

    /**
     * fall sem nær í flokk eftir auðkenni
     * @param id
     * @return
     */
    Category getCategoryById(Long id);

    /**
     * Fall sem vistar notanda
     * @param user
     * @return
     */
    User addUser(User user);

    /**
     * Fall sem nær í notanda eftir auðkenni
     * @param id
     * @return
     */
    User getUserById(Long id);
}

package main.services;

import main.model.Artist;
import main.model.Event;
import main.model.Location;
import main.model.Category;
import main.model.User;

import java.util.Date;
import java.util.List;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhannesdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir

 * @date September 2017
 * Háskóli Íslands
 *
 * Þjónustuklasi
 */

public interface IService {
    /**
     * Fall sem vistar viðburð
     * @param event
     * @return
     */
    Event addEvent(Event event);

    /**
     * Fall sem nær í viðburð eftir auðkenni
     * @param id
     * @return
     */
    Event getEventById(Long id);

    /**
     * Fall sem nær í 10 viðburði
     * @return Listi af viðburðum
     */
    List<Event> getTop10Events();

    /**
     * Fall sem nær í viðburði eftir titli og flokk
     * @param title
     * @param category_id
     * @param dateBegin
     * @param dateEnd
     * @return
     */
    List<Event> search(String title, Long category_id, Date dateBegin, Date dateEnd);

    /**
     * Fall sem vistar staðsetningu
     * @param location
     * @return
     */
    Location addLocation(Location location);

    /**
     * Fall sem nær í allar staðsetningar
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
     * Fall sem vistar listamann
     * @param artist
     * @return
     */
    Artist addArtist(Artist artist);

    /**
     * Fall sem nær í alla listamenn
     * @return
     */
    List<Artist> getAllArtist();

    /**
     * Fall sem nær í listamann eftir auðkenni
     * @param id
     * @return
     */
    Artist getArtistById(Long id);

    /**
     * Fall sem nær í allar flokka
     * @return
     */
    List<Category> getAllCategories();

    /**
     * Fall sem nær í flokk eftir auðkenni
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
     * Fall sem nær í notanda eftir notendanafni
     * @param username
     * @return
     */
    User getUserByUserName(String username);
}

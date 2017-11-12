package main.repository;

import main.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

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
 * Geymsla fyrir alla viðburði
 */

public interface IEventRepository extends JpaRepository<Event, Long>{
    /**
     * Nær í alla viðburði
     * @return listi af viðburðum
     */
    List<Event> findAll();

    /**
     * Bætir við viðburði
     * @param event
     */
    @Override
    Event save(Event event);

    /**
     *
     * Nær í viðburð eftir auðkenni
     * @param id
     * @return event
     */
    @Override
    Event findOne(Long id);

    List<Event> findByTitleContaining(String title);

    List<Event> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCaseAndCategoryIdAndDateBeginLessThanEqualAndDateEndGreaterThanEqualAndDeleted(String title, String description, Long category_id, Date dateEnd, Date dateBegin, boolean deleted);

    /**
     *  Nær í 10 viðburði
     * @return List<event>
     */
    @Query(value="SELECT * FROM event WHERE deleted=false LIMIT 10", nativeQuery = true)
    List<Event> findTop10();


}
package main.repository;

import main.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

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
 * Geymsla fyrir alla Event-a.
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
     *  Nær í event efitr Id-i.
     * @param id = auðkenni fyrir eventinn sem á að sækja
     * @return event
     */
    @Override
    Event findOne(Long id);

    Event findOneByDeleted(boolean deleted);

    List<Event> findByTitleContaining(String title);

    List<Event> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCaseAndCategoryIdAndDateBeginLessThanEqualAndDateEndGreaterThanEqualAndDeleted(String title, String description, Long category_id, Date dateEnd, Date dateBegin, boolean deleted);

    /**
     *  Nær í 10 event.
     * @return List<event>
     */
    @Query(value="SELECT * FROM event WHERE deleted=false LIMIT 10", nativeQuery = true)
    List<Event> findTop10();


}
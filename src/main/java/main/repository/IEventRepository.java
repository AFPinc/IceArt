package main.repository;

import main.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhannesdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Valgerður Sigfinnsdóttir
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

    /**
     * Nær í viðburði eftir ýmsum upplýsingum
     * @param searchValue
     * @param category_id
     * @param dateEnd
     * @param dateBegin
     * @return
     */
    @Query(value ="SELECT * FROM event WHERE (upper(title) LIKE upper(?1) OR upper(description) LIKE upper(?1)) AND category_id = ?2 AND date_begin <= ?3 AND date_end >= ?4 and deleted=false", nativeQuery = true)
    List<Event> findBySearchCritera(String searchValue, Long category_id, Date dateEnd, Date dateBegin);

    /**
     *  Nær í 10 viðburði
     * @return List<event>
     */
    @Query(value="SELECT * FROM event WHERE deleted=false LIMIT 10", nativeQuery = true)
    List<Event> findTop10();


}
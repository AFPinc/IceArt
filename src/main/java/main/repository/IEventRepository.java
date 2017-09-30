package main.repository;

import main.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Valgerdur Sigfinnsdottir
 * @date September 2017
 * Háskóli Íslands
 *
 * Geymsla fyrir alla Event-a.
 */

public interface IEventRepository extends JpaRepository<Event, Long>{
    /**
     * Nær í alla event-a
     * @return listi af event-um
     */
    List<Event> findAll();

    /**
     * Bætir við event
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


}

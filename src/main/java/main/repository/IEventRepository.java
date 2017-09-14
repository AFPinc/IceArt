package main.repository;

import main.model.Event;
import java.util.List;

/**
 * @author Valgerdur Sigfinnsdottir
 * @date September 2017
 * Háskóli Íslands
 *
 * Geymsla fyrir alla Event-a.
 */

public interface IEventRepository {
    /**
     * Nær í alla event-a
     * @return listi af event-um
     */
    List<Event> getAll();

    /**
     * Bætir við event
     * @param event
     */
    void add(Event event);

    /**
     *
     *  Nær í event efitr Id-i.
     * @return event
     */
     Event getById(int id);


}

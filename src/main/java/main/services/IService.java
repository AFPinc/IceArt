package main.services;

import main.model.Event;

/**
 * @author Valgerdur Sigfinnsdottir
 * @date September 2017
 * Háskóli Íslands
 *
 * Þjónustan sér um allar aðgerðir sem hægt er að gera í kerfinu
 */
public interface IService {
    /**
     *   Bætir við viðburði
     *   @param event
     *   @return
     */
    int addEvent(Event event);

    Event getEventById(int id);
}

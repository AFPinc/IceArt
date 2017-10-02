package main.repository;

import main.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Sigurlaug Þórðardóttir
 * @date Október 2017
 * Háskóli Íslands
 *
 * Location Repository
 */
public interface ILocationRepositroy extends JpaRepository<Location, Long> {
    /**
     * gets all locations
     * @return list of locations
     */
    List<Location> findAll();

    /**
     * Saves new location
     * @param location
     */
    @Override
    Location save(Location location);

    /**
     * Gets location by Id
     * @param id
     * @return location
     */
    @Override
    Location findOne(Long id);
}

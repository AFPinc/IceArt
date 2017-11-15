package main.repository;

import main.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhannesdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Valgerður Sigfinnsdóttir
 * @date Október 2017
 * Háskóli Íslands
 *
 * Geymsla fyrir allar staðsetningar
 */
public interface ILocationRepository extends JpaRepository<Location, Long> {
    /**
     * Nær í allar staðsetningar
     * @return list of locations
     */
    List<Location> findAll();

    /**
     * Vistar nýja staðsetningu
     * @param location
     */
    @Override
    Location save(Location location);

    /**
     * Nær í staðsetningu eftir auðkenni
     * @param id
     * @return location
     */
    @Override
    Location findOne(Long id);
}

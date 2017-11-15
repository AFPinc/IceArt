package main.repository;

import main.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhansdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Valgerður Sigfinnsdóttir
 * @date Október 2017
 * Háskóli Íslands
 *
 * Geymsla fyrir alla notendur
 */

public interface IUserRepository extends JpaRepository<User, Long> {
    /**
     * Nær í alla notendur
     * @return list of users
     */
    List<User> findAll();

    /**
     * Vistar nýjan notanda
     * @param user
     */
    @Override
    User save(User user);

    /**
     * Nær í notanda eftir auðkenni
     * @param id
     * @return artist
     */
    @Override
    User findOne(Long id);

    /**
     * Nær í notanda eftir nafni
     * @param username
     * @return
     */
    User findTopByUsername(String username);
}

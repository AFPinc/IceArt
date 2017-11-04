package main.repository;

import main.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhansdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date Október 2017
 * Háskóli Íslands
 *
 * User Repository
 */

public interface IUserRepository extends JpaRepository<User, Long> {
    /**
     * gets all user
     * @return list of users
     */
    List<User> findAll();

    /**
     * Saves new user
     * @param user
     */
    @Override
    User save(User user);

    /**
     * Gets user by Id
     * @param id
     * @return artist
     */
    @Override
    User findOne(Long id);
}

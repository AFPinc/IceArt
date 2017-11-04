package main.repository;

import main.model.Artist;
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
 * Artist Repository
 */
public interface IArtistRepository extends JpaRepository<Artist, Long> {
    /**
     * gets all artists
     * @return list of artists
     */
    List<Artist> findAll();

    /**
     * Saves new artist
     * @param artist
     */
    @Override
    Artist save(Artist artist);

    /**
     * Gets artist by Id
     * @param id
     * @return artist
     */
    @Override
    Artist findOne(Long id);
}

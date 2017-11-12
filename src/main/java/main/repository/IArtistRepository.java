package main.repository;

import main.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhannesdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date Október 2017
 * Háskóli Íslands
 *
 * Geymsla fyrir alla listamenn
 */
public interface IArtistRepository extends JpaRepository<Artist, Long> {
    /**
     * Nær í alla listamenn
     * @return list of artists
     */
    List<Artist> findAll();

    /**
     * Vistar nýjan listamann
     * @param artist
     */
    @Override
    Artist save(Artist artist);

    /**
     * Nær í listamann eftir auðkenni
     * @param id
     * @return artist
     */
    @Override
    Artist findOne(Long id);
}

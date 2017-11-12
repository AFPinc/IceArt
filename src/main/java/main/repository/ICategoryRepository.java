package main.repository;

import main.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhannesdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date 13. október 2017
 * Háskóli Íslands
 *
 * Geymsla fyrir alla flokka
 */

public interface ICategoryRepository extends JpaRepository<Category, Long> {
    /**
     * Nær í alla flokka
     * @return list of categories
     */
    List<Category> findAll();

    /**
     * Nær í flokk eftir auðkenni
     * @param id
     * @return category
     */
    @Override
    Category findOne(Long id);
}

package main.repository;

import main.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Melkorka Mjöll
 * @date 13. október 2017
 * Háskóli Íslands
 *
 * Geymsla fyrir allar categories
 */

public interface ICategoryRepository extends JpaRepository<Category, Long> {
    /**
     * gets all categories
     * @return list of categories
     */
    List<Category> findAll();

    /**
     * Gets category by Id
     * @param id
     * @return category
     */
    @Override
    Category findOne(Long id);
}

package guru.springframework.recipe_app.repositories;

import guru.springframework.recipe_app.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);

}

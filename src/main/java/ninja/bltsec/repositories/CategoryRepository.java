package ninja.bltsec.repositories;

import ninja.bltsec.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}

package guru.springframework.sfgrecipe.repositories;

import guru.springframework.sfgrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}

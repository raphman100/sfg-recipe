package guru.springframework.sfgrecipe.repositories;

import guru.springframework.sfgrecipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

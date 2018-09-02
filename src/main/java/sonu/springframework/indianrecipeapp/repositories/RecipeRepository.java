package sonu.springframework.indianrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sonu.springframework.indianrecipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}

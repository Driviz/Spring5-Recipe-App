package tech.driviz.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;

import tech.driviz.recipeproject.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}

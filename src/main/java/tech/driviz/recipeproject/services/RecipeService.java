package tech.driviz.recipeproject.services;

import java.util.Set;

import tech.driviz.recipeproject.models.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
}

package tech.driviz.recipeproject.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import tech.driviz.recipeproject.models.Recipe;
import tech.driviz.recipeproject.repositories.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {

	private final RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	@Override
	public Set<Recipe> getRecipes() {
		Set<Recipe> recipeSet = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining((recipe)->recipeSet.add(recipe));
		return recipeSet;
	}
	
	@Override
	public Recipe findById(Long id) {
		Optional<Recipe> recipe = recipeRepository.findById(id);
		
		if(!recipe.isPresent())
			throw new RuntimeException("Recipe Not Found!!");
		
		return recipe.get();
	}
}

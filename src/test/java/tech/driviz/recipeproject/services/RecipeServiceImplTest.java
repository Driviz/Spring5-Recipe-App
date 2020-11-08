package tech.driviz.recipeproject.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import tech.driviz.recipeproject.models.Recipe;
import tech.driviz.recipeproject.repositories.RecipeRepository;

class RecipeServiceImplTest {

	RecipeServiceImpl recipeService;
	
	@Mock
	RecipeRepository recipeRepository;

	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		recipeService = new RecipeServiceImpl(recipeRepository);
	}

	@Test
	void testGetRecipes() {
		Set<Recipe> recipeSet = new HashSet<>();
		Recipe recipe = new Recipe();
		recipeSet.add(recipe);
		
		when(recipeRepository.findAll()).thenReturn(recipeSet);
		Set<Recipe> recipes = recipeService.getRecipes();
		assertEquals(recipeSet.size(), recipes.size());
		verify(recipeRepository, times(1)).findAll();
	}

}

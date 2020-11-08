package tech.driviz.recipeproject.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CategoryTest {

	Category category;

	@BeforeEach
	public void setUp() {
		category = new Category();
	}

	@Test
	void testGetId() {
		Long id = 4L;
		category.setId(id);
		assertEquals(4L, category.getId());
	}

	@Test
	void testGetCategoryName() {
		
	}

	@Test
	void testGetRecipes() {
	}

}

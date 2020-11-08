package tech.driviz.recipeproject.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tech.driviz.recipeproject.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	Optional<Category> findByCategoryName(String categoryName);

}

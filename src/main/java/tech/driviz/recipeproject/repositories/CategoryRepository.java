package tech.driviz.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;

import tech.driviz.recipeproject.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}

package tech.driviz.recipeproject.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import tech.driviz.recipeproject.models.Category;
import tech.driviz.recipeproject.models.UnitOfMeasure;
import tech.driviz.recipeproject.repositories.CategoryRepository;
import tech.driviz.recipeproject.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {

	private final CategoryRepository categoryRepository;
	private final UnitOfMeasureRepository unitOfMeasureRepository;

	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}

	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage() {
		Optional<Category> optionalCategory = categoryRepository.findByCategoryName("American");
		Optional<UnitOfMeasure> optionalUnit = unitOfMeasureRepository.findByUom("Teaspoon");

		System.out.println(optionalCategory.get().getId());
		System.out.println(optionalUnit.get().getId());
		return "index";
	}
}

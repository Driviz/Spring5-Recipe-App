package tech.driviz.recipeproject.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tech.driviz.recipeproject.models.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

	Optional<UnitOfMeasure> findByUom(String uom);

}

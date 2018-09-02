package sonu.springframework.indianrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sonu.springframework.indianrecipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {


    Optional<UnitOfMeasure> findByDescription(String description);
}

package sonu.springframework.indianrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sonu.springframework.indianrecipeapp.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {


    Optional<Category> findByDescription(String description);
}

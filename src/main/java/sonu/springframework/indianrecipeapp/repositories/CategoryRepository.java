package sonu.springframework.indianrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sonu.springframework.indianrecipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}

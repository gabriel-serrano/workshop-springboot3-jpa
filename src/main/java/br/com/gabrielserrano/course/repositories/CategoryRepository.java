package br.com.gabrielserrano.course.repositories;

import br.com.gabrielserrano.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

package br.com.gabrielserrano.course.repositories;

import br.com.gabrielserrano.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

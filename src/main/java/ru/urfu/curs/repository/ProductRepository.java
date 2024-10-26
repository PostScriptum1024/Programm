package ru.urfu.curs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.curs.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

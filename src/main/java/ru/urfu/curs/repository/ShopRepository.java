package ru.urfu.curs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.curs.entity.Shop;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop, Long> {
}

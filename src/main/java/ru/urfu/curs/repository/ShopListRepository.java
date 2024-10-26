package ru.urfu.curs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.curs.entity.Product;
import ru.urfu.curs.entity.ShopList;

import java.util.List;

public interface ShopListRepository extends JpaRepository<ShopList, Long> {
    List<ShopList> findByUserId(Long id);
}

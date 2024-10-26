package ru.urfu.curs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.curs.entity.ProductInShop;

import java.util.Optional;

public interface ProductInShopRepository extends JpaRepository<ProductInShop, Long> {
    Optional<ProductInShop> findByProductIdAndShopId(Long productId, Long shopId);
    Optional<ProductInShop> findByProductId(Long id);
}

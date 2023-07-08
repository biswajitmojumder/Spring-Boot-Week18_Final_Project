package accounting.files.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import accounting.files.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {

}

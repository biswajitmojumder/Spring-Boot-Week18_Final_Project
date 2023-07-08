package accounting.files.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import accounting.files.entity.InvoiceItem;

@Repository
public interface InvoiceItemDao extends JpaRepository<InvoiceItem, Long> {

}

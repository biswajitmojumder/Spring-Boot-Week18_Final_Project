package accounting.files.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import accounting.files.entity.Invoice;

@Repository
public interface InvoiceDao extends JpaRepository<Invoice, Long> {

}
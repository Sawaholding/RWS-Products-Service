package RWS.products.repository;
import RWS.products.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface DB_Repository extends CrudRepository<Category,String> { }

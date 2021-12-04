package usa.reto2ciclo4.repository.crud;

import org.springframework.data.mongodb.repository.MongoRepository;
import usa.reto2ciclo4.model.Product;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
}

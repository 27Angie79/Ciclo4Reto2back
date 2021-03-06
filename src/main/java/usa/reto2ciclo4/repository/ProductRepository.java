package usa.reto2ciclo4.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.reto2ciclo4.model.Product;
import usa.reto2ciclo4.repository.crud.ProductCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    @Autowired
    private ProductCrudRepository productCrudRepository;
    public List<Product>getAll(){
        return productCrudRepository.findAll();
    }
    public Optional<Product> getProduct(String reference){
        return productCrudRepository.findById(reference);
    }
    public Product save(Product product){
        return productCrudRepository.save(product);
    }
    public void update(Product product){
        productCrudRepository.save(product);
    }
    public void delete(Product product){
        productCrudRepository.delete(product);
    }
}

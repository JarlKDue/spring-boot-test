package miracle.com.springbootproject;

import miracle.com.springbootproject.model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This is the fruit repository.
 */
@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {

}

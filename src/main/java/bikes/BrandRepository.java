package bikes;

import org.springframework.data.repository.CrudRepository;

public interface BrandRepository extends CrudRepository<Manufacturer, Long> {

}
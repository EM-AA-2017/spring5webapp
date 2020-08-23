package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.Domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by EM on 8/1/20.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

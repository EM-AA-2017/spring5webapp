package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.Domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by EM on 7/31/20.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}

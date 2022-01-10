package Goljat.backend.domain;

import org.springframework.data.repository.CrudRepository;

public interface WeekRepository extends CrudRepository<Week, Long> {

	Week findById(long id);

}

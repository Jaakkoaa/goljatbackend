package Goljat.backend.domain;

import org.springframework.data.repository.CrudRepository;

public interface PlanRepository extends CrudRepository<Plan, Long> {

	Plan findById(long id);

}
package uk.ac.belfastmet.titanic.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Titanic;

public interface TitanicRepository extends CrudRepository<Titanic, Integer> {

	
	Titanic findBypassengerid(Integer passengerid);

	Iterable<Titanic> findBysurvived(String survived);

	Iterable<Titanic> findByPclass(String pclass);

	Iterable<Titanic> findByName(String name);
	
	Iterable<Titanic> findBySex(String sex);
	
	Iterable<Titanic> findByAge(Integer age);

	
}

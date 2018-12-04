package uk.ac.belfastmet.titanic.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Titanic;

public interface DwarfRepository extends CrudRepository<Titanic, Integer> {

	
	Iterable<Titanic> findByAuthor(String author);

	Titanic findByDwarfId(Integer dwarfId);

	Iterable<Titanic> findByName(String name);

	Iterable<Titanic> findByNameAndAuthor(String name, String author);

	
}

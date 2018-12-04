package uk.ac.belfastmet.titanic.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {

	
	Iterable<Dwarf> findByAuthor(String author);

	Dwarf findByDwarfId(Integer dwarfId);

	Iterable<Dwarf> findByName(String name);

	Iterable<Dwarf> findByNameAndAuthor(String name, String author);

	
}

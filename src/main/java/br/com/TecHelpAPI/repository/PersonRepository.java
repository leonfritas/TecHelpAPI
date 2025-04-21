package br.com.TecHelpAPI.repository;

import br.com.TecHelpAPI.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}

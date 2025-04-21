package br.com.TecHelpAPI.repository;

import br.com.TecHelpAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}

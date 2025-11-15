package br.todonext.todonext.Repository;

import br.todonext.todonext.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

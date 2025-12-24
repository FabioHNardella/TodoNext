package br.todonext.todonext.Repository;

import br.todonext.todonext.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

package br.todonext.todonext.repository;

import br.todonext.todonext.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

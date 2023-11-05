package br.com.fiap.cp02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.cp02.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
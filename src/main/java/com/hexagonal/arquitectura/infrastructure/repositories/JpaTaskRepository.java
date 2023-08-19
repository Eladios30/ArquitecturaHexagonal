package com.hexagonal.arquitectura.infrastructure.repositories;

import com.hexagonal.arquitectura.domain.models.Task;
import com.hexagonal.arquitectura.domain.ports.out.TaskRepositoryPort;
import com.hexagonal.arquitectura.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}

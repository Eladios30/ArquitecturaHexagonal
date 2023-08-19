package com.hexagonal.arquitectura.application.usecases;

import com.hexagonal.arquitectura.domain.models.Task;
import com.hexagonal.arquitectura.domain.ports.in.UpdateTaskUseCase;
import com.hexagonal.arquitectura.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateAdditionalTaskInfoUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateAdditionalTaskInfoUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}

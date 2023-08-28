package com.hexagonal.arquitectura.infrastructure.config;

import com.hexagonal.arquitectura.application.services.TaskService;
import com.hexagonal.arquitectura.application.usecases.CreateTaskUseCaseImpl;
import com.hexagonal.arquitectura.application.usecases.DeleteTaskUseCaseImpl;
import com.hexagonal.arquitectura.application.usecases.RetrieveTaskUseCaseImpl;
import com.hexagonal.arquitectura.application.usecases.UpdateAdditionalTaskInfoUseCaseImpl;
import com.hexagonal.arquitectura.domain.ports.in.GetAdditionalTaskInfo;
import com.hexagonal.arquitectura.domain.ports.out.TaskRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfo getAdditionalTaskInfo){
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateAdditionalTaskInfoUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfo
        );
    }
}

package br.todonext.todonext.Mapper;

import br.todonext.todonext.DTO.TaskRequestDTO;
import br.todonext.todonext.DTO.TaskResponseDTO;
import br.todonext.todonext.Entity.Task;
import br.todonext.todonext.Entity.User;
import br.todonext.todonext.Enum.TaskStatus;

import java.time.LocalDateTime;

public class TaskMapper {

    public static Task toEntityCreate(TaskRequestDTO req, User user){
        Task task = new Task(LocalDateTime.now());
        task.setUser(user);
        task.setType(req.getType());
        task.setTitle(req.getTitle());
        task.setDescription(req.getDescription());
        task.setUpdatedDate(LocalDateTime.now());
        task.setEndingDate(req.getEndingDate());
        task.setTaskStatus(TaskStatus.TODO);
        task.setCheckboxStatus(req.getCheckboxStatus());
        task.setLocked(false);

        return task;
   }

   public static Task toEntityUpdate(TaskRequestDTO req, Task task){
        if(req.getType() != null) task.setType(req.getType());
        if(req.getTitle() != null) task.setTitle(req.getTitle());
        if(req.getDescription() != null) task.setDescription(req.getDescription());
        if(req.getEndingDate() != null) task.setEndingDate(req.getEndingDate());
        if(req.getCheckboxStatus() != null) task.setCheckboxStatus(req.getCheckboxStatus());

        return task;
   }

    public static TaskResponseDTO toResponseDTO(Task task, User user){
        return new TaskResponseDTO(
                task.getId(),
                user.getId(),
                task.getType(),
                task.getTitle(),
                task.getDescription(),
                task.getCreationDate(),
                task.getUpdatedDate(),
                task.getEndingDate(),
                task.getTaskStatus(),
                task.getCheckboxStatus(),
                task.isLocked()
        );
    }
}

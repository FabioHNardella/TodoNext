package br.todonext.todonext.DTO.Task;

import br.todonext.todonext.Enum.CheckboxStatus;
import br.todonext.todonext.Enum.TaskStatus;
import br.todonext.todonext.Enum.TaskType;

import java.time.LocalDateTime;

public record TaskResponseDTO(
        long id,
        long userId,
        TaskType type,
        String title,
        String description,
        LocalDateTime creationDate,
        LocalDateTime updatedDate,
        LocalDateTime endingDate,
        TaskStatus taskStatus,
        CheckboxStatus checkboxStatus,
        boolean isLocked
){
}

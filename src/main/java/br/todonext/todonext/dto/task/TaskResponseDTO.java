package br.todonext.todonext.dto.task;

import br.todonext.todonext.enumerator.CheckboxStatus;
import br.todonext.todonext.enumerator.TaskStatus;
import br.todonext.todonext.enumerator.TaskType;

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

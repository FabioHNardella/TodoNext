package br.todonext.todonext.DTO;

import br.todonext.todonext.Enum.CheckboxStatus;
import br.todonext.todonext.Enum.TaskStatus;
import br.todonext.todonext.Enum.TaskType;
import com.fasterxml.jackson.annotation.JsonInclude;

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

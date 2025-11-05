package br.todonext.todonext.DTO;

import br.todonext.todonext.Enum.CheckboxStatus;
import br.todonext.todonext.Enum.TaskStatus;
import br.todonext.todonext.Enum.TaskType;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskRequestDTO {
    private TaskType type;
    private String title;
    private String description;
    private LocalDateTime updatedDate;
    private LocalDateTime endingDate;
    private TaskStatus taskStatus;
    private CheckboxStatus checkboxStatus;
    private Boolean isLocked;
}

package br.todonext.todonext.DTO;

import br.todonext.todonext.Enum.CheckboxStatus;
import br.todonext.todonext.Enum.TaskType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskRequestDTO {
    private TaskType type;
    private String title;
    private String description;
    private LocalDateTime endingDate;
    private CheckboxStatus checkboxStatus;

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDateTime endingDate) {
        this.endingDate = endingDate;
    }

    public CheckboxStatus getCheckboxStatus() {
        return checkboxStatus;
    }

    public void setCheckboxStatus(CheckboxStatus checkboxStatus) {
        this.checkboxStatus = checkboxStatus;
    }
}

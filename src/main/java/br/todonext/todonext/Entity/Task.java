package br.todonext.todonext.Entity;

import br.todonext.todonext.Enum.TaskStatus;
import br.todonext.todonext.Enum.CheckboxStatus;
import br.todonext.todonext.Enum.TaskType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "task_type", nullable = false)
    private TaskType type;

    @Column(name = "task_title", nullable = false)
    private String title;

    @Column(name = "task_description")
    private String description;

    @Column(name = "task_creation_date", nullable = false, updatable = false)
    private final LocalDateTime creationDate;

    @Column(name = "task_updated_date")
    private LocalDateTime updatedDate;

    @Column(name = "task_ending_date")
    private LocalDateTime endingDate;

    @Column(name = "task_status", nullable = false)
    private TaskStatus taskStatus;

    @Column(name = "task_checkbox_status", nullable = false)
    private CheckboxStatus checkboxStatus;

    @Column(name = "is_Locked", nullable = false)
    private boolean isLocked;

    public Task(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }


    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public LocalDateTime getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDateTime endingDate) {
        this.endingDate = endingDate;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public CheckboxStatus getCheckboxStatus() {
        return checkboxStatus;
    }

    public void setCheckboxStatus(CheckboxStatus checkboxStatus) {
        this.checkboxStatus = checkboxStatus;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
}

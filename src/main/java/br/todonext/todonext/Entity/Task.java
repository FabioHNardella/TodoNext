package br.todonext.todonext.Entity;

import br.todonext.todonext.Enum.TaskStatus;
import br.todonext.todonext.Enum.CheckboxStatus;
import br.todonext.todonext.Enum.TaskType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
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

}

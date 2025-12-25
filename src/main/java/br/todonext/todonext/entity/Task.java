package br.todonext.todonext.entity;

import br.todonext.todonext.enumerator.TaskStatus;
import br.todonext.todonext.enumerator.CheckboxStatus;
import br.todonext.todonext.enumerator.TaskType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Setter
    private User user;

    @Column(name = "task_type", nullable = false)
    @Setter
    private TaskType type;

    @Column(name = "task_title", nullable = false)
    @Setter
    private String title;

    @Column(name = "task_description")
    @Setter
    private String description;

    @Column(name = "task_creation_date", nullable = false, updatable = false)
    private final LocalDateTime creationDate;

    @Column(name = "task_updated_date")
    @Setter
    private LocalDateTime updatedDate;

    @Column(name = "task_ending_date")
    @Setter
    private LocalDateTime endingDate;

    @Column(name = "task_status", nullable = false)
    @Setter
    private TaskStatus taskStatus;

    @Column(name = "task_checkbox_status", nullable = false)
    @Setter
    private CheckboxStatus checkboxStatus;

    @Column(name = "is_Locked", nullable = false)
    @Setter
    private boolean isLocked;

    public Task(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}

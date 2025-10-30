package br.todonext.todonext.Entity;

import br.todonext.todonext.Enum.TaskStatus;
import br.todonext.todonext.Enum.CheckboxStatus;
import br.todonext.todonext.Enum.TaskType;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private long id;

    @Column(name = "task_type")
    private TaskType type;

    @Column(name = "task_title")
    private String title;

    @Column(name = "task_description")
    private String description;

    @Column(name = "task_creation_date")
    private Date creationDate;

    @Column(name = "task_ending_date")
    private Date endingDate;

    @Column(name = "task_status")
    private TaskStatus taskStatus;

    @Column(name = "task_checkbox_status")
    private CheckboxStatus checkboxStatus;
}

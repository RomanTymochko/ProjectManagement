package pl.edu.wsb.projectmanagement.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double progress;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    private Project project;

    @OneToMany(mappedBy = "sprint",cascade = CascadeType.REMOVE)
    private List<Task> taskList;
}

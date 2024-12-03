package org.example.user;


import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private LocalDateTime createdDate;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Todo> todos;

    // Constructors
    public Project() {}

    public Project(Long id, String title, LocalDateTime createdDate, List<Todo> todos) {
        this.id = id;
        this.title = title;
        this.createdDate = createdDate;
        this.todos = todos;
    }

    // Getters and Setters
    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public LocalDateTime getCreatedDate() {

        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {

        this.createdDate = createdDate;
    }

    public List<Todo> getTodos() {

        return todos;
    }

    public void setTodos(List<Todo> todos) {

        this.todos = todos;
    }
}


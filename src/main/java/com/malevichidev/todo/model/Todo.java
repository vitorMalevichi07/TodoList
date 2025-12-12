package com.malevichidev.todo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean realized;
    private int priority;
    

    public Todo(Long id, String name, String description, boolean realized, int priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.realized = realized;
        this.priority = priority;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isRealized() {
        return realized;
    }
    public void setRealized(boolean realized) {
        this.realized = realized;
    }
    public int getPrioridade() {
        return priority;
    }
    public void setPrioridade(int priority) {
        this.priority = priority;
    }

    
}

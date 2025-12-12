package com.malevichidev.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malevichidev.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}

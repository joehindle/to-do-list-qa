package com.qa.finalproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.finalproject.model.TodoItem;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {

	List<TodoItem> findAll();

}

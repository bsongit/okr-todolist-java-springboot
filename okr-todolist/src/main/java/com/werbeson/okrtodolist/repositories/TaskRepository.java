package com.werbeson.okrtodolist.repositories;

import com.werbeson.okrtodolist.domain.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
    
}

package com.werbeson.okrtodolist.service;

import java.util.Arrays;

import com.werbeson.okrtodolist.domain.Task;
import com.werbeson.okrtodolist.domain.User;
import com.werbeson.okrtodolist.repositories.TaskRepository;
import com.werbeson.okrtodolist.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
	private UserRepository userRepository;
	@Autowired
	private TaskRepository taskRepository;
    
    public void instanciaBaseDeDados(){
    
		User user1 = new User(null, "werbeson", "besonquadros@gmail.com", "123456");
        User user2 = new User(null, "Edson", "gplay@gmail.com", "123456");
        User user3 = new User(null, "Gugui", "Gui@gmail.com", "123456");

		Task task1 =  new Task(null,"estudar", "estudo de ingles", user1);
        Task task2 =  new Task(null,"estudar", "estudo de java", user2);
        Task task3 =  new Task(null,"estudar", "estudo de fazenda", user3);

		user1.getTaskList().addAll(Arrays.asList(task1));
        user2.getTaskList().addAll(Arrays.asList(task2));
        user3.getTaskList().addAll(Arrays.asList(task3));

		this.userRepository.saveAll(Arrays.asList(user1,user2,user3));
		this.taskRepository.saveAll(Arrays.asList(task1,task2,task3));

    }
    
}

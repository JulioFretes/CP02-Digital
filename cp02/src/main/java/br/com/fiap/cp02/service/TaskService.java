package br.com.fiap.cp02.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.cp02.entity.Task;
import br.com.fiap.cp02.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    
	public List<Task> get(){
		return taskRepository.findAll();
	}
	
	public Optional<Task> getById(Long id){
		return taskRepository.findById(id);
	}

	public Task salvar(Task task) {
		return taskRepository.save(task);
	}

	public void deleteById(Long id) {
		taskRepository.deleteById(id);
	}
}
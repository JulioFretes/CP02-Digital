package br.com.fiap.cp02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.cp02.entity.Task;
import br.com.fiap.cp02.entity.Usuario;
import br.com.fiap.cp02.service.TaskService;

@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:19006")
@RestController
public class TaskController {

	@Autowired
    private TaskService taskService;

    @GetMapping("/task")
    public ResponseEntity<List<Task>> get() {
        return ResponseEntity.ok(taskService.get());
    }
	
    @GetMapping("/task/{id}")
    public ResponseEntity<Task> getById(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getById(id).get());
    }
	
    @PostMapping("/task")
    public ResponseEntity<Task> update(@RequestBody Task task) {
        return ResponseEntity.ok(taskService.salvar(task));
    }
  
    @DeleteMapping("/task/{id}")
    public ResponseEntity<Usuario> delete(@PathVariable Long id){
    	taskService.deleteById(id);        
        return ResponseEntity.ok().build();
    }
    
    @PutMapping("/task")
	public ResponseEntity<Task> replaceUsuario(@RequestBody Task newTask) {
    	return ResponseEntity.ok(taskService.salvar(newTask));
    }
	
}

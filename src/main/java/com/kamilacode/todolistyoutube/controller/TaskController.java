package com.kamilacode.todolistyoutube.controller;

import com.kamilacode.todolistyoutube.model.Task;
import com.kamilacode.todolistyoutube.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Slf4j
public class TaskController {

    TaskService taskService;

    @PostMapping("/tasks")
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask (@RequestBody Task task){
        log.info("Criando uma nova tarefa com as informações [{}]", task);
        return taskService.createTask(task);
    }

    @GetMapping("/tasks")
    @ResponseStatus(HttpStatus.OK)
    public List<Task> getAllTasks(){
        log.info("Listando todas as tarefas cadastradas");
        return taskService.listAllTask();

    }

    @GetMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Task> getTaskById(@PathVariable (value = "id") Long id){
        log.info("Buscando tarefas com o id [{}]", id);
        return taskService.findTaskById(id);

    }

    @PutMapping ("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Task> updateTaskById(@PathVariable (value = "id") Long id, @RequestBody Task task){
        log.info("Atualizando tarefas com o id [{}] as novas informações são: [{}]", id, task);
        return taskService.updateTaskById(task,id);

    }

    @DeleteMapping ("/tasks/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> deleteById(@PathVariable (value = "id") Long id){
        log.info("Excluindo tarefas com o id [{}]", id);
        return taskService.deleteById(id);

    }
}

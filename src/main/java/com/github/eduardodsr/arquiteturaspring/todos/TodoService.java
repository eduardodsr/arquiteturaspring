package com.github.eduardodsr.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public TodoEntity salvar(TodoEntity novoTodo) {
        return repository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo) {
        repository.save(todo);
    }

    public TodoEntity buscarPorId(Integer id) {
        return repository.findById(id).orElseThrow(null);
    }
}

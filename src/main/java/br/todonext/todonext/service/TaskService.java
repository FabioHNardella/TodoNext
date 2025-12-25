package br.todonext.todonext.service;
import br.todonext.todonext.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    //Create - 201


    //Read - 200

    //Update - 200 = OK | 204 = NO CONTENT

    //Delete - 200

    // 404 - Not found
}

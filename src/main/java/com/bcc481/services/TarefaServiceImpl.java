package com.bcc481.services;

import com.bcc481.models.Tarefa;
import com.bcc481.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hannon on 29/01/16.
 */
@Service
public class TarefaServiceImpl implements TarefaService {

    private TarefaRepository tarefaRepository;

    @Autowired
    public void setTarefaRepository(TarefaRepository tarefaRepository){
        this.tarefaRepository = tarefaRepository;
    }

    @Override
    public Iterable<Tarefa> listAllTarefas(){
        return this.tarefaRepository.findAll();
    }

    @Override
    public Tarefa getTarefaById(Long id){
        return this.tarefaRepository.findOne(id);
    }

    @Override
    public Tarefa saveTarefa(Tarefa tarefa){
        return this.tarefaRepository.save(tarefa);
    }

    @Override
    public void deleteTarefa(Long id){ this.tarefaRepository.delete(id);}
}

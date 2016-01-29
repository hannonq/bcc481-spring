package com.bcc481.services;

import com.bcc481.models.Tarefa;

/**
 * Created by hannon on 29/01/16.
 */
public interface TarefaService {
    Iterable<Tarefa> listAllTarefas();
    Tarefa getTarefaById(Long id);
    Tarefa saveTarefa(Tarefa tarefa);
}

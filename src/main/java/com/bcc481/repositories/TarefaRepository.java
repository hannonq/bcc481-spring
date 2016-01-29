package com.bcc481.repositories;

import com.bcc481.models.Tarefa;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hannon on 29/01/16.
 */
public interface TarefaRepository extends CrudRepository<Tarefa, Long> {
}

package com.bcc481.controllers;

import com.bcc481.models.Tarefa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hannon on 29/01/16.
 */
@Controller
public class TarefaController {

    @RequestMapping("tarefa/nova")
    public String novaTarefa(Model model){
        model.addAttribute("tarefa", new Tarefa());
        return "tarefaform";
    }

    @RequestMapping(value = "tarefa", method = RequestMethod.POST)
    public String saveTarefa(Tarefa tarefa){

    }
}

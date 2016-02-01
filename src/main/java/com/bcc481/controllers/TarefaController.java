package com.bcc481.controllers;

import com.bcc481.models.Tarefa;
import com.bcc481.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hannon on 29/01/16.
 */
@Controller
public class TarefaController {

    private TarefaService tarefaService;

    @Autowired
    public void setTarefaService(TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }

    //lista todas as tarefas
    @RequestMapping(value = "/tarefas", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("tarefas", tarefaService.listAllTarefas());
        System.out.println("Returning tarefas");
        return "tarefas";
    }

    //cria uma nova tarefa
    @RequestMapping("tarefa/nova")
    public String novaTarefa(Model model){
        model.addAttribute("tarefa", new Tarefa());
        System.out.println("Nova tarefa");
        return "tarefaform";
    }

    //salva uma nova tarefa
    @RequestMapping(value = "tarefa", method = RequestMethod.POST)
    public String saveTarefa(Tarefa tarefa){
        tarefaService.saveTarefa(tarefa);

        return "redirect:/tarefas";
    }

    @RequestMapping("tarefa/editar/{id}")
    public String edit(@PathVariable Long id, Model model){
        model.addAttribute("tarefa", tarefaService.getTarefaById(id));
        return "tarefaform";
    }

    @RequestMapping("tarefa/apagar/{id}")
    public String delete(@PathVariable Long id, Model model){
        tarefaService.deleteTarefa(id);
        return "redirect:/tarefas";
    }

    @RequestMapping("tarefa/{id}")
    public String showTarefa(@PathVariable Long id, Model model){
        model.addAttribute("tarefa", tarefaService.getTarefaById(id));
        return "tarefashow";
    }


}


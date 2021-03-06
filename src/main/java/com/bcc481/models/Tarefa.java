package com.bcc481.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by hannon on 29/01/16.
 */

@Entity
public class Tarefa {

    @Id
    @GeneratedValue
    private Long id;

    private String descricao;

    private boolean finalizado = false;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/mm/YYYY")
    private Calendar dataFinalizacao;

    @Override
    public String toString(){
        return String.format(
                "Tarefa: '%s', ID: %d, ", this.descricao, this.id
        );

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Calendar dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }
}
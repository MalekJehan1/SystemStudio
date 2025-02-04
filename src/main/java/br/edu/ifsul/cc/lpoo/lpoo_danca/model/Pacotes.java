/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author malek
 * 
 * campo descricao deve conter até 120 caracteres e ser obrigatório. 
    campo valor deve ser obrigatório
 */
@Entity
public class Pacotes implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false, length = 120)
    private String descricao;
    
    @Column(nullable = false, precision = 10, scale = 2)
    private Double valor;
    
    @ManyToOne
    @JoinColumn(name = "modalidade_id")
    private Modalidades modalidade;

    public Pacotes() {
    }

    public Pacotes(Integer id, String descricao, Double valor, Modalidades modalidade) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.modalidade = modalidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Modalidades getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidades modalidade) {
        this.modalidade = modalidade;
    }
    
    
    
    
}

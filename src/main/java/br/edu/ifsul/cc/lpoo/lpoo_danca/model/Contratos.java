/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dalmi
 */
@Entity
public class Contratos implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataInicio;
    
    @Column(nullable = false, precision = 10, scale = 2)
    private Double valorDesconto;
  
    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Alunos aluno;
    
    @ManyToOne
    @JoinColumn(name = "itens_id")
    private itensContratos itensContrato;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FormaPgt formaPgt;
    

    public Contratos() {
 
        this.dataInicio = Calendar.getInstance();
    }

    public Contratos(Integer id, Calendar dataInicio, Double valorDesconto, Alunos aluno, itensContratos itensContrato, FormaPgt formaPgt) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.valorDesconto = valorDesconto;
        this.aluno = aluno;
        this.itensContrato = itensContrato;
        this.formaPgt = formaPgt;
    }

   

    

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setFormaPgt(FormaPgt formaPgt) {
        this.formaPgt = formaPgt;
    }

    public FormaPgt getFormaPgt() {
        return formaPgt;
    }

    public void setItensContrato(itensContratos itensContrato) {
        this.itensContrato = itensContrato;
    }

    public itensContratos getItensContrato() {
        return itensContrato;
    }

    

    


    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }
    
     
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 20221PF.CC0003
 */

@Entity
public class FolhaPagamento implements Serializable{
 
    @Id
    private Integer numeroPag;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data;
    
    @Column(nullable = false, precision = 10, scale = 2)
    private Double valorReceber;
    
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professores professor;

    public FolhaPagamento() {
    }

    public FolhaPagamento(Integer numeroPag, Calendar data, Double valorReceber, Professores professor) {
        this.numeroPag = numeroPag;
        this.data = data;
        this.valorReceber = valorReceber;
        this.professor = professor;
    }

    public void setNumeroPag(Integer numeroPag) {
        this.numeroPag = numeroPag;
    }

    public Integer getNumeroPag() {
        return numeroPag;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public Professores getProfessor() {
        return professor;
    }

    

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Double getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(Double valorReceber) {
        this.valorReceber = valorReceber;
    }
    
    public void CalcularFolhaMes(){
        
        
        
    }
    
    
}

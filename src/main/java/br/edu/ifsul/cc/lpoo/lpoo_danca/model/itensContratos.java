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
import javax.persistence.OneToOne;

/**
 *
 * @author dalmi
 */

@Entity
public class itensContratos implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idContrato;
    
    @ManyToOne
    @JoinColumn(name = "pacote_id", nullable = false)
    private Pacotes pacote;//associação

    public itensContratos() {
    }

    public itensContratos(Integer idContrato, Pacotes pacote) {
        this.idContrato = idContrato;
        this.pacote = pacote;
    }

   

   

    
    

    public Integer getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

  
    public void setPacote(Pacotes pacote) {
        this.pacote = pacote;
    }

    public Pacotes getPacote() {
        return pacote;
    }
    
    
    
}

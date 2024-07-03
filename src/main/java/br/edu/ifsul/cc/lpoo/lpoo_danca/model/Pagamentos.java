/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dalmi
 */

@Entity
public class Pagamentos implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataVcto;
    
    @Column(nullable = false, precision = 10, scale = 2)
    private Double valor;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataPgt;
    
    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contratos contrato;

    public Pagamentos() {
    }

    public Pagamentos(Integer id, Calendar dataVcto, Double valor, Calendar dataPgt, Contratos contrato) {
        this.id = id;
        this.dataVcto = dataVcto;
        this.valor = valor;
        this.dataPgt = dataPgt;
        this.contrato = contrato;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataVcto() {
        return dataVcto;
    }

    public void setDataVcto(Calendar dataVcto) {
        this.dataVcto = dataVcto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Calendar getDataPgt() {
        return dataPgt;
    }

    public void setDataPgt(Calendar dataPgt) {
        this.dataPgt = dataPgt;
    }

    public Contratos getContrato() {
        return contrato;
    }

    public void setContrato(Contratos contrato) {
        this.contrato = contrato;
    }
    
    public void GerarPagamento(Integer mesRef){
        
        
        
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author malek
 */
@Entity
@DiscriminatorValue("P")
public class Professores extends Pessoas{
    
    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Calendar dataAdmissao;
    
    @OneToMany(mappedBy = "professor")
    private Collection<FolhaPagamento> folhapagamento;
   
    @ManyToMany
    private Collection<Modalidades> modalidades;

    public Professores() {
    }

    public Professores(Calendar dataAdmissao, Collection<FolhaPagamento> folhapagamento, Integer id, String nome, String fone, Calendar dataAniver, String email, String endereco) {
        super(id, nome, fone, dataAniver, email, endereco);
        this.dataAdmissao = dataAdmissao;
        this.folhapagamento = folhapagamento;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setFolhapagamento(Collection<FolhaPagamento> folhapagamento) {
        this.folhapagamento = folhapagamento;
    }

    public Collection<FolhaPagamento> getFolhapagamento() {
        return folhapagamento;
    }
    
    
    
    
    
}

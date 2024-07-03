
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.testProduto;

import br.edu.ifsul.cc.lpoo.lpoo_danca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Modalidades;
import org.junit.Test;

/**
 *
 * @author malek
 */
public class TestPersistenciaJPA {
    
    @Test
    public void testConexaoJPA() {
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        
        if (jpa.conexaoAberta()) {
            System.out.println("conectou no BD via jpa ...");
            jpa.fecharConexao();
            
            Modalidades m = new Modalidades();
            m.setDescricao("teste");
            
            try {
                jpa.persist(m);
            } catch (Exception e) {
                System.out.println("Jpa não persistido!!");
            }
            
        } else {
            System.out.println("nao conectou no BD ...");

        }
    }
    
}

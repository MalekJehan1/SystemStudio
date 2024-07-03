package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Alunos;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.FormaPgt;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.itensContratos;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-03T10:55:56", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Contratos.class)
public class Contratos_ { 

    public static volatile SingularAttribute<Contratos, FormaPgt> formaPgt;
    public static volatile SingularAttribute<Contratos, Alunos> aluno;
    public static volatile SingularAttribute<Contratos, Double> valorDesconto;
    public static volatile SingularAttribute<Contratos, itensContratos> itensContrato;
    public static volatile SingularAttribute<Contratos, Integer> id;
    public static volatile SingularAttribute<Contratos, Calendar> dataInicio;

}
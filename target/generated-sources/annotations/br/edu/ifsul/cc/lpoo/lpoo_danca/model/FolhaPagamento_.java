package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Professores;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-03T10:56:13", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(FolhaPagamento.class)
public class FolhaPagamento_ { 

    public static volatile SingularAttribute<FolhaPagamento, Professores> professor;
    public static volatile SingularAttribute<FolhaPagamento, Calendar> data;
    public static volatile SingularAttribute<FolhaPagamento, Double> valorReceber;
    public static volatile SingularAttribute<FolhaPagamento, Integer> numeroPag;

}
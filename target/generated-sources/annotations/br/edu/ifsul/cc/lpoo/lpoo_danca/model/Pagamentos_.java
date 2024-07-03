package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Contratos;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-03T10:55:56", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pagamentos.class)
public class Pagamentos_ { 

    public static volatile SingularAttribute<Pagamentos, Calendar> dataVcto;
    public static volatile SingularAttribute<Pagamentos, Calendar> dataPgt;
    public static volatile SingularAttribute<Pagamentos, Double> valor;
    public static volatile SingularAttribute<Pagamentos, Contratos> contrato;
    public static volatile SingularAttribute<Pagamentos, Integer> id;

}
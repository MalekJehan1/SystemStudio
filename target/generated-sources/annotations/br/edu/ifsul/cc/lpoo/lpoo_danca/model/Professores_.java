package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import br.edu.ifsul.cc.lpoo.lpoo_danca.model.FolhaPagamento;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Modalidades;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-03T10:44:56", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Professores.class)
public class Professores_ extends Pessoas_ {

    public static volatile CollectionAttribute<Professores, Modalidades> modalidades;
    public static volatile SingularAttribute<Professores, Calendar> dataAdmissao;
    public static volatile CollectionAttribute<Professores, FolhaPagamento> folhapagamento;

}
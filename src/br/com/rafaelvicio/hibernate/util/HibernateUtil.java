package br.com.rafaelvicio.hibernate.util;

import br.com.rafaelvicio.hibernate.Produto;

/**
 * Created by STEFANINI on 06/06/2017.
 */
public class HibernateUtil {

    private static SessionFactory factory;

    static {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.addAnotatedClass(Produto.class);
        factory = cfg.buildSessionFactory();
    }

    public Session getSession() {
        return factory.openSession();
    }
}

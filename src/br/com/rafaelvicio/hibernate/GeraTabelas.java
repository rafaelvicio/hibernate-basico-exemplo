package br.com.rafaelvicio.hibernate;

/**
 * Created by STEFANINI on 06/06/2017.
 */
public class GeraTabelas {
    public static void main(String[] args) {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.addAnnotatedClass(Produto.class);
        SchemaExport se = new SchemaExport(cfg);
        se.create(true, true);
    }
}
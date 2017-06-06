package br.com.rafaelvicio.hibernate;

/**
 * Created by STEFANINI on 06/06/2017.
 */
public class CarregaProduto {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.addAnnotatedClass(Produto.class);
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Produto produto = (Produto)session.load(Produto.class, 1L);

        System.out.println("Nome do produto: " + produto.getNome());
        session.close();
    }
}


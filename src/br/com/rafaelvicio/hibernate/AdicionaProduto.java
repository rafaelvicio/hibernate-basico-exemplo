package br.com.rafaelvicio.hibernate;

/**
 * Created by STEFANINI on 06/06/2017.
 */
public class AdicionaProduto {

    public static void main(String[] args) {

        Produto p = new Produto();
        p.setNome("Nome aqui");
        p.setDescricao("Descricao aqui");
        p.setPreco(100.50);

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.addAnnotatedClass(Produto.class);

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();

        System.out.println("ID do produto: " + p.getId());
        session.close();
    }
}

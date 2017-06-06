package br.com.rafaelvicio.hibernate;

/**
 * Created by STEFANINI on 06/06/2017.
 */
public class TestaProdutoDAO {

    Session session = new HibernateUtil().getSession();

    ProdutoDAO dao = new ProdutoDAO(session);
    Produto produto = new Produto();

    session.beginTransaction();
    dao.salva(produto);
    session.getTransaction().commit();

    session.close();

}

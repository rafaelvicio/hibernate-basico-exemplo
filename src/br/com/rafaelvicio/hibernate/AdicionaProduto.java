package br.com.rafaelvicio.hibernate;

import br.com.rafaelvicio.hibernate.util.HibernateUtil;

/**
 * Created by STEFANINI on 06/06/2017.
 */
public class AdicionaProduto {

    public static void main(String[] args) {

        Session session = new HibernateUtil().getSession();

        Produto p = new Produto();
        p.setNome("Nome aqui");
        p.setDescricao("Descricao aqui");
        p.setPreco(100.50);

        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();

        System.out.println("ID do produto: " + p.getId());
        session.close();
    }
}

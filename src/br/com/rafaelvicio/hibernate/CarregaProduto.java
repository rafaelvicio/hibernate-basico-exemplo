package br.com.rafaelvicio.hibernate;

import br.com.rafaelvicio.hibernate.util.HibernateUtil;

/**
 * Created by STEFANINI on 06/06/2017.
 */
public class CarregaProduto {

    public static void main(String[] args) {

        Session session = new HibernateUtil().getSession();

        Produto produto = (Produto)session.load(Produto.class, 1L);

        System.out.println("Nome do produto: " + produto.getNome());
        session.close();
    }
}


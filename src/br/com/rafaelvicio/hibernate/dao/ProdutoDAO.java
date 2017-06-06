package br.com.rafaelvicio.hibernate.dao;

/**
 * Created by STEFANINI on 06/06/2017.
 */
public class ProdutoDAO {

    private Session session;

    public ProdutoDAO (Session session) {
        this.session = session;
    }

    public void salva (Produto p) {
        this.session.save(p);
    }

    public void remove (Produto p) {
        this.session.delete(p);
    }

    public Produto procura(Long id) {
        return (Produto) this.session.load(Produto.class, id);
    }

    public void atualiza (Produto p) {
        this.session.update(p);
    }
}


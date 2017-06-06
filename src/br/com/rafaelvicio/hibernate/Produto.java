package br.com.rafaelvicio.hibernate;

/**
 * Created by STEFANINI on 06/06/2017.
 */
@Entity
public class Produto {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descricao;

    @Column(name = "preco_total_prod", nullable = true, length = 50)
    private double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

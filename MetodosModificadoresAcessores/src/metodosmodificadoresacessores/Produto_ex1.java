package metodosmodificadoresacessores;

public class Produto_ex1 {
    private String nome;
    private int quantidade;

    public Produto_ex1(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // get e set
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // adiciona e remove produtos
    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    // limite de estoque
    public boolean estoqueBaixo(int limite) {
        return this.quantidade < limite;
    }
}


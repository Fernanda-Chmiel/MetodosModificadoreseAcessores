package metodosmodificadoresacessores;

import java.util.ArrayList;
import java.util.List;

public class Pedido_ex1 {

    private Fornecedor_ex1 fornecedor;
    private Produto_ex1 produto;
    private int quantidade;

    // lista de produtos
    private static List<Produto_ex1> produtos = new ArrayList<>();

    public Pedido_ex1(Fornecedor_ex1 fornecedor, Produto_ex1 produto, int quantidade) {
        this.fornecedor = fornecedor;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // get e set
    public Fornecedor_ex1 getFornecedor() {
        return fornecedor;
    }

    public Produto_ex1 getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setFornecedor(Fornecedor_ex1 fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setProduto(Produto_ex1 produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void processar() {
        produto.adicionarEstoque(quantidade); //add quantidade
        if (!produtos.contains(produto)) { // verifica se o produto está na lista 
            produtos.add(produto); // se ainda não tiver, add novo produto
        }
    }

    public static void listarEstoqueBaixo(int limite) {
        System.out.println("Produtos com estoque abaixo de " + limite + ":"); //mensagem
        for (Produto_ex1 p : produtos) {
            if (p.estoqueBaixo(limite)) { // verifica se o estoque está baixo
                System.out.println(p.getNome() + ": " + p.getQuantidade() + " em estoque"); // // Se estiver, nome e a quantidade em estoque
            }
        }
    }
}

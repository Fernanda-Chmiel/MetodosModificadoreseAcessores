/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.metodosmodificadoreseacessores;

import java.util.ArrayList;
import java.util.List;

public class Usuarios_ex3 {
    private String username;
    private List<Publicacoes_ex3> postagem;

    public Usuarios_ex3(String username) {
        this.username = username;
        this.postagem = new ArrayList<>();
    }

    // Métodos acessores
    public String getUsername() {
        return username;
    }

    public List<Publicacoes_ex3> getPostagem() {
        return postagem;
    }

    // Métodos modificadores
    public void criarPostagem(String conteudo) {
        Publicacoes_ex3 novaPostagem = new Publicacoes_ex3(this, conteudo);
        postagem.add(novaPostagem);
    }

    public void listarPostagem() {
        System.out.println("Publicações de " + username + ":");
        for (Publicacoes_ex3 publicacao : postagem) {
            System.out.println("Postagem ID: " + publicacao.getId() + " - " + publicacao.getConteudo());
            publicacao.mostrarComentarios(); // Chama o método de mostrar comentários na instância
        }
    }
}

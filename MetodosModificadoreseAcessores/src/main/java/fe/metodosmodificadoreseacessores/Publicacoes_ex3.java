/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.metodosmodificadoreseacessores;

import java.util.ArrayList;
import java.util.List;

public class Publicacoes_ex3 {

    private static int contadorId = 1;
    private int id;
    private Usuarios_ex3 autor;
    private String conteudo;
    private List<Comentarios_ex3> comentarios;

    public Publicacoes_ex3(Usuarios_ex3 autor, String conteudo) {
        this.id = contadorId++;
        this.autor = autor;
        this.conteudo = conteudo;
        this.comentarios = new ArrayList<>();
    }

    // Métodos acessores
    public int getId() {
        return id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public List<Comentarios_ex3> getComentarios() {
        return comentarios;
    }

    // Métodos modificadores
    public void adicionarComentario(Comentarios_ex3 comentario) {
        comentarios.add(comentario);
    }

    public void mostrarComentarios() {
        System.out.println("Comentários da postagem: ");
        for (Comentarios_ex3 comentario : comentarios) {
            System.out.println(comentario.getAutor().getUsername() + ": " + comentario.getTexto());
        }
    }
}

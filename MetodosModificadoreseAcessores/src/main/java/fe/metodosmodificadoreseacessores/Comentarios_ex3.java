/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.metodosmodificadoreseacessores;

public class Comentarios_ex3 {
    private Usuarios_ex3 autor;
    private String texto;

    public Comentarios_ex3(Usuarios_ex3 autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    // Métodos acessores
    public Usuarios_ex3 getAutor() {
        return autor;
    }

    public String getTexto() {
        return texto;
    }
}

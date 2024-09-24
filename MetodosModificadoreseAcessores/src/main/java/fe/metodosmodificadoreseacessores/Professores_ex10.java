/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.metodosmodificadoreseacessores;

import java.util.ArrayList;
import java.util.List;


public class Professores_ex10 {
  private String nome;
    private List<Disciplinas_ex10> disciplinas;

    public Professores_ex10(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplinas_ex10> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplinas_ex10> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public void addDisciplinas (Disciplinas_ex10 disciplina){
    this.disciplinas.add(disciplina);
    }
    
    public void Mostrar(){
        System.out.println("Professor: " + nome);
        
        for (Disciplinas_ex10 disciplina : disciplinas){
        disciplina.Mostrar();
        }
    }
    }

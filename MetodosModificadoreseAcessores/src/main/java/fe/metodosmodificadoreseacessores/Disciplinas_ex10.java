/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.metodosmodificadoreseacessores;

import java.util.ArrayList;
import java.util.List;

   public class Disciplinas_ex10 {
       
    private String disciplina;
    private List<Estudantes_ex10> estudantes;

    public Disciplinas_ex10(String disciplina) {
        this.disciplina = disciplina;
        this.estudantes = new ArrayList<>();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public List<Estudantes_ex10> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudantes_ex10> estudantes) {
        this.estudantes = estudantes;
    }
    
    
    public void addEstudantes(Estudantes_ex10 estudante){
        this.estudantes.add(estudante);
    }
    
    
    public double media(){
    double media = 0;
    for (Estudantes_ex10 estudante : estudantes){
    media += estudante.getNota();
    }
    return (double) media / estudantes.size();
    }
    
    public void Mostrar(){
        System.out.println("Disciplina: " + disciplina);
        for (Estudantes_ex10 estudante : estudantes){
        estudante.Mostrar();
        }
    }
}

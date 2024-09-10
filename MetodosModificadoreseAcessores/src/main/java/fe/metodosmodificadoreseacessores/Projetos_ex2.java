/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.metodosmodificadoreseacessores;

import java.util.ArrayList;
import java.util.List;

public class Projetos_ex2 {
    
  private String Nome;
    private List<Funcionarios_ex2> Funcionarios;

    public Projetos_ex2(String Nome) {
        this.Nome = Nome;
        this.Funcionarios = new ArrayList<>();
    }

    // get
    public String getNome() {
        return Nome;
    }

    public List<Funcionarios_ex2> getFuncionarios() {
        return Funcionarios;
    }

    // set
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void adicionarFuncionario(Funcionarios_ex2 Funcionario) {
        if (!Funcionarios.contains(Funcionario)) {
            Funcionarios.add(Funcionario);
        }
    }   
    
}

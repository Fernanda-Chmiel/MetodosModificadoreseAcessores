/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.metodosmodificadoreseacessores;

import java.util.ArrayList;
import java.util.List;

public class Departamentos_ex2 {

    private String Nome;
    private List<Funcionarios_ex2> Funcionarios;

    public Departamentos_ex2(String Nome) {
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

    public double calcularMediaSalarial() { // calcula a media por departamento
        if (Funcionarios.isEmpty()) return 0;
        double soma = 0;
        for (Funcionarios_ex2 Funcionario : Funcionarios) {
            soma += Funcionario.getSalario();
        }
        return soma / Funcionarios.size(); 
    }
}

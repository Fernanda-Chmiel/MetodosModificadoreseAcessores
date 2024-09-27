package metodosmodificadoresacessores;

import java.util.ArrayList;
import java.util.List;

public class Funcionarios_ex2 {
    private String Nome;
    private double Salario;
    private List<Projetos_ex2> Projetos;

    public Funcionarios_ex2(String Nome, double Salario) {
        this.Nome = Nome;
        this.Salario = Salario;
        this.Projetos = new ArrayList<>();
    }

    // get
    public String getNome() {
        return Nome;
    }

    public double getSalario() {
        return Salario;
    }

    public List<Projetos_ex2> getProjetos() {
        return Projetos;
    }

    // set
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public void adicionarProjeto(Projetos_ex2 Projeto) {
        if (!Projetos.contains(Projeto)) { //ve se o projeto está na lista do funcionario
            Projetos.add(Projeto); // add o nprojeto a lista do funcionario
            Projeto.adicionarFuncionario(this); //lista de funcionarios que criaram o projeto
        }
    }

    public void exibirProjetos() {
        System.out.println("Projetos de " + Nome + ":");
        for (Projetos_ex2 Projeto : Projetos) { // verifica os projetos
            System.out.println(Projeto.getNome()); //// mostra o nome do projeto
        }
    }
}

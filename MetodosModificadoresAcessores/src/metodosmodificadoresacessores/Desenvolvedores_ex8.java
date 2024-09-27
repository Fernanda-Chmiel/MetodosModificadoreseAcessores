package metodosmodificadoresacessores;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedores_ex8 {
    private String Nome;
    private List<Tarefas_ex8> TR;

    public Desenvolvedores_ex8(String Nome) {
        this.Nome = Nome;
        this.TR = new ArrayList<>();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public List<Tarefas_ex8> getTarefas() {
        return TR;
    }

    public void setTarefas(List<Tarefas_ex8> tarefas) {
        this.TR = tarefas;
    }

    public void adicionarTarefas(Tarefas_ex8 tarefa) {
        this.TR.add(tarefa);
    }

    public void Mostrar() {
        System.out.println("Tarefas de " + Nome + ": ");
        for (Tarefas_ex8 tarefa : TR) {
            System.out.println("- " + tarefa.getTarefa() + " - tempo estimado: " + tarefa.getTempo() + "h");
        }
    }
}

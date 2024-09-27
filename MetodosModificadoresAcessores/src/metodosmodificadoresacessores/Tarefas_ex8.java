package metodosmodificadoresacessores;

public class Tarefas_ex8 {
    private String Tarefa;
    private int Tempo;

    public Tarefas_ex8(String Tarefa, int Tempo) {
        this.Tarefa = Tarefa;
        this.Tempo = Tempo;
    }

    public String getTarefa() {
        return Tarefa;
    }

    public void setTarefa(String Tarefa) {
        this.Tarefa = Tarefa;
    }

    public int getTempo() {
        return Tempo;
    }

    public void setTempo(int Tempo) {
        this.Tempo = Tempo;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.metodosmodificadoreseacessores;

import java.util.ArrayList;
import java.util.List;

public class Projetos_ex8 {
    private String Nome;
    private List<Tarefas_ex8> TR;

    public Projetos_ex8(String Nome) {
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

    public void setTarefas(List<Tarefas_ex8> TR) {
        this.TR = TR;
    }

    public void adicionarTarefas(Tarefas_ex8 TR) {
        this.TR.add(TR);
    }

    public int Carga() {
        int cargaTrabalho = 0;
        for (Tarefas_ex8 TR : TR) {
            cargaTrabalho += TR.getTempo();
        }
        return cargaTrabalho;
    }
}

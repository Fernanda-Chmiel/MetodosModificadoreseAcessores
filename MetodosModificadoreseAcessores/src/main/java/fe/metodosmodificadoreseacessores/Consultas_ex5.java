/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.metodosmodificadoreseacessores;

public class Consultas_ex5 {

    private Pacientes_ex5 paciente;
    private Medicos_ex5 medico;
    private String dataHora; 

    public Consultas_ex5(Pacientes_ex5 paciente, Medicos_ex5 medico, String dataHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
    }

    public Pacientes_ex5 getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes_ex5 paciente) {
        this.paciente = paciente;
    }

    public Medicos_ex5 getMedico() {
        return medico;
    }

    public void setMedico(Medicos_ex5 medico) {
        this.medico = medico;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}

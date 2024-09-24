/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.metodosmodificadoreseacessores;

import java.util.ArrayList;
import java.util.List;

public class Reserva_ex4 {

    private String Destino;
    private List<Voo_ex4> Voo;

    public Reserva_ex4(String Destino) {
        this.Destino = Destino;
        this.Voo = new ArrayList<>();
    }

    public String getLugar() {
        return Destino;
    }

    public void setLugar(String Destino) {
        this.Destino = Destino;
    }

    public List<Voo_ex4> getVoos() {
        return Voo;
    }

    public void setVoos(List<Voo_ex4> Voo) {
        this.Voo = Voo;
    }
    public void addVoos (Voo_ex4 Voo){
    this.Voo.add(Voo);
    }
}


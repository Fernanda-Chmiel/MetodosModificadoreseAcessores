package metodosmodificadoresacessores;

import java.util.ArrayList;
import java.util.List;

public class Passageiro_ex4 {
    
    private String NomePassageiro;
    private List<Reserva_ex4> Registro;

    public Passageiro_ex4(String NomePassageiro) {
        this.NomePassageiro = NomePassageiro;
        this.Registro = new ArrayList<>();
    }

    public String getNomePassageiro() {
        return NomePassageiro;
    }

    public void setNome(String NomePassageiro) {
        this.NomePassageiro = NomePassageiro;
    }

    public List<Reserva_ex4> getReservas() {
        return Registro;
    }

    public void setReservas(List<Reserva_ex4> reservas) {
        this.Registro = reservas;
    }
    public void addReservas (Reserva_ex4 reserva){
        this.Registro.add(reserva);
    }
    
    public void exibir (){
        System.out.println("Passageiro: " + NomePassageiro);
        for (Reserva_ex4 reserva : Registro) {
            System.out.println("Reserva: " + reserva.getLugar());
        for (Voo_ex4 Voo : reserva.getVoos()){
            System.out.println("Voo: " + Voo.getNumeroVoo() +" "+ Voo.getDisponibilidade());
        }
        }
    }
}


package metodosmodificadoresacessores;

import java.util.ArrayList;
import java.util.List;

    public class Mesas_ex9 {
    private String numero;
    private List<Pedidos_ex9> pedidos;
    private String reserva;

    public Mesas_ex9(String numero) {
        this.numero = numero;
        this.pedidos = new ArrayList<>();
    }

    public void addPedido(Pedidos_ex9 pedido) {
        pedidos.add(pedido);
    }

    public void addReserva(Mesas_ex9 reserva) {
        this.reserva = reserva.numero;
    }

    public void exibir() {
        System.out.println("Mesa: " + numero);
        for (Pedidos_ex9 pedido : pedidos) {
            pedido.exibir();
        }
        if (reserva != null) {
            System.out.println("Reserva futura: " + reserva);
        } else {
            System.out.println("Sem reservas futuras.");
        }
    }
}

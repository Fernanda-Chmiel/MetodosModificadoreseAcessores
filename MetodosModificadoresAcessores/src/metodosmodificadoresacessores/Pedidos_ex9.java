package metodosmodificadoresacessores;

import java.util.ArrayList;
import java.util.List;

    public class Pedidos_ex9 {
    private String nome;
    private List<Pratos_ex9> pratos;

    public Pedidos_ex9(String nome) {
        this.nome = nome;
        this.pratos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pratos_ex9> getPratos() {
        return pratos;
    }

    public void setPratos(List<Pratos_ex9> pratos) {
        this.pratos = pratos;
    }

    public void addPrato(Pratos_ex9 prato) {
        pratos.add(prato);
    }

    public double calcularTotal() {
        double total = 0;
        for (Pratos_ex9 prato : pratos) {
            total += prato.getPreco();
        }
        return total;
    }

    public void exibir() {
        System.out.println("Pedido: " + nome);
        for (Pratos_ex9 prato : pratos) {
            System.out.println("- " + prato.getNome() + ": R$ " + prato.getPreco());
        }
        System.out.println("Total do pedido: R$ " + calcularTotal());
    }
}

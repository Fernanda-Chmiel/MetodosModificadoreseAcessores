package metodosmodificadoresacessores;

public class Carros_ex6 {
    
    private String Modelo;
    private Marcas_ex6 Marca;
    private double Preco;

    public Carros_ex6(String Modelo, Marcas_ex6 Marca) {
        this.Modelo = Modelo;
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public Marcas_ex6 getMarca() {
        return Marca;
    }

    public void setMarca(Marcas_ex6 Marca) {
        this.Marca = Marca;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    
    
    
}

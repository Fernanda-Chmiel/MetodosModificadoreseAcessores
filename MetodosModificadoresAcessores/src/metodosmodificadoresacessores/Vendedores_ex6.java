package metodosmodificadoresacessores;

public class Vendedores_ex6 {
    private String Nome;
    private Carros_ex6 CarroVendido;

    public Vendedores_ex6(String Nome, Carros_ex6 CarroVendido) {
        this.Nome = Nome;
        this.CarroVendido = CarroVendido;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Carros_ex6 getCarroVendido() {
        return CarroVendido;
    }

    public void setCarroVendido(Carros_ex6 CarroVendido) {
        this.CarroVendido = CarroVendido;
    }
        
        
    
}

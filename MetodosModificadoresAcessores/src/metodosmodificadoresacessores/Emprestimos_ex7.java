package metodosmodificadoresacessores;

public class Emprestimos_ex7 {
    Livros_ex7 Livro;
    int diasAtraso;

    public Emprestimos_ex7(Livros_ex7 Livro, int diasAtraso) {
        this.Livro = Livro;
        this.diasAtraso = diasAtraso;
        Livro.FazerEmprestimos();
    }

    public Livros_ex7 getLivro() {
        return Livro;
    }

    public void setLivro(Livros_ex7 Livro) {
        this.Livro = Livro;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }
    
    public double Multa() {
        return (diasAtraso / 7) * 5.00; //  multa de 5 por semana
    }
    
}

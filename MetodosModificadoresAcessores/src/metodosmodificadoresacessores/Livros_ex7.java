package metodosmodificadoresacessores;

public class Livros_ex7 {
    String Titulo;
    Autores_ex7 Autor;
    int Emprestimos;

    public Livros_ex7(String Titulo, Autores_ex7 Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Emprestimos = Emprestimos= 0;
    }

    public int getEmprestimos() {
        return Emprestimos;
    }
    
    public void FazerEmprestimos() {
        Emprestimos++;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Autores_ex7 getAutor() {
        return Autor;
    }

    public void setAutor(Autores_ex7 Autor) {
        this.Autor = Autor;
    }
    
    
    
}

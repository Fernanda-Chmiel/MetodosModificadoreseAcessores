package metodosmodificadoresacessores;

    public class Estudantes_ex10 {
    private String NomeAluno;
    private double Nota;

    public Estudantes_ex10(String NomeAluno, double Nota) {
        this.NomeAluno = NomeAluno;
        this.Nota = Nota;
    }

    public String getNomeAluno() {
        return NomeAluno;
    }

    public void setNomeAluno(String NomeAluno) {
        this.NomeAluno = NomeAluno;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }
    
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public void Mostrar(){
        System.out.println("Estudante: " + NomeAluno + " - Nota: " + Nota);
    }
}
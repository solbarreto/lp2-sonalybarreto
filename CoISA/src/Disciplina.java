public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private double[] notas;
    private int quantidadeProvas;
    private double somaNotas;
    public Disciplina(String nomeDisciplina) {
        this.horas = 0;
        this.notas = new double[4];
        this.quantidadeProvas = 0;
        this.somaNotas = 0;
    }

    public void cadastraHoras(int horas) {
        this.horas = horas;
    }

    public void cadastraNota (int numProva, double nota) {
        this.notas[quantidadeProvas] = nota;
        this.quantidadeProvas = numProva;
        this.somaNotas += nota;
    }

    public String aprovado() {
        double media = somaNotas / quantidadeProvas;
        if (media >= 7)
    }

}

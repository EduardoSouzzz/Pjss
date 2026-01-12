public class Aluno {

    private Integer matricula;
    private String nome;
    private Double notaFinal;

    public Aluno(Integer matricula, String nome, Double notaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public Integer getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public Double getNotaFinal() {
        return notaFinal;
    }
}

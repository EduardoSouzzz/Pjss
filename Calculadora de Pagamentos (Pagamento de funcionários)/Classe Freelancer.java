public class Freelancer implements Pagavel{

    private String nome;
    private int HrsTrabalhadas;
    private double ValorPorHrs;

    public Freelancer(String nome, int hrsTrabalhadas, double valorPorHrs) {
        this.nome = nome;
        HrsTrabalhadas = hrsTrabalhadas;
        ValorPorHrs = valorPorHrs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHrsTrabalhadas() {
        return HrsTrabalhadas;
    }

    public void setHrsTrabalhadas(int hrsTrabalhadas) {
        HrsTrabalhadas = hrsTrabalhadas;
    }

    public double getValorPorHrs() {
        return ValorPorHrs;
    }

    public void setValorPorHrs(double valorPorHrs) {
        ValorPorHrs = valorPorHrs;
    }

    public double calcularPagamento() {
        return HrsTrabalhadas * ValorPorHrs;
    }
}

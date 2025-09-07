public abstract class Funcionario {

    private String nome;
    private Double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    abstract double calcularPagamento();

    public String toString() {
        return nome + " - Pagamento: " + String.format("%.2f", calcularPagamento());
    }
}

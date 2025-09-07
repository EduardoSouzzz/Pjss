public class PJ extends Funcionario{

    public PJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public Double getSalarioBase() {
        return super.getSalarioBase();
    }

    @Override
    public double calcularPagamento() {
        return getSalarioBase() * 0.5;
    }
}

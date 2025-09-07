public class CLT extends Funcionario{

    public CLT (String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamento() {
        return getSalarioBase() * 1.1;
    }
}

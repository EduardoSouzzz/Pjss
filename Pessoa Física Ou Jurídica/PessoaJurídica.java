public class PessoaJuridica extends ImpostoTaxa{

    private int NumerosDeFuncionarios;

    public PessoaJuridica (String nome, double rendaAnual, int numerosDeFuncionarios) {
        super(nome, rendaAnual);
        this.NumerosDeFuncionarios = numerosDeFuncionarios;
    }

    public int getNumerosDeFuncionarios() {
        return NumerosDeFuncionarios;
    }

    public void setNumerosDeFuncionarios(int numerosDeFuncionarios) {
        NumerosDeFuncionarios = numerosDeFuncionarios;
    }

    @Override
    public double calcularImposto() {
        if (getNumerosDeFuncionarios() > 10) {
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }
}

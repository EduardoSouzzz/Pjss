public class PessoaFisica extends ImpostoTaxa{

    private Double DespesasComSaude;

    public PessoaFisica(String nome, double despesasComSaude, double rendaAnual) {
        super(nome, rendaAnual);
        this.DespesasComSaude = despesasComSaude;
    }
    public Double getDespesasComSaude() {
        return DespesasComSaude;
    }
    public void setDespesasComSaude(Double despesasComSaude) {
        DespesasComSaude = despesasComSaude;
    }

    @Override
    public double calcularImposto() {
        double imposto;
        if (getRendaAnual() < 20000.0 ) {
            imposto = getRendaAnual() * 0.15;
        } else {
            imposto = getRendaAnual() * 0.25;
        }
        imposto -= getDespesasComSaude() * 0.5;
        return imposto < 0 ? 0 : imposto;
    }
}

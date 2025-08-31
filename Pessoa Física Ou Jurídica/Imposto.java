abstract class ImpostoTaxa extends Contribuinte{

    public ImpostoTaxa(String nome, double rendaAnual) {
        super(nome, rendaAnual);
    }

    public abstract double calcularImposto();

}

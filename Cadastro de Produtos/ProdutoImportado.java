public class ProdutoImportado extends Produto{

    private Double taxaAlfandega;

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    public double TotalPrice () {
        return getPreco() + taxaAlfandega;
    }

    @Override
    public String priceTag () {
        return getNome()
                + " $ "
                + String.format("%.2f", TotalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", taxaAlfandega)
                + ")";
    }
}

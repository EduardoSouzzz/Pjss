public class ProdutoImportado extends Produto{

    private double taxaDeImportacao;

    public ProdutoImportado(String nome, double preco, int quantidade, double taxaDeImportacao) {
        super(nome, preco, quantidade);
        this.taxaDeImportacao = taxaDeImportacao;
    }

    @Override
    public String toString() {
        return "Produto {Nome = " + getNome()+ ", preço R$ " + getPreco() +
                " (Taxa de importação = " + taxaDeImportacao + "}";
    }

    public double precoTotal() {
        return getPreco() + taxaDeImportacao;
    }

    public double valorTotalImportado() {
        return precoTotal() * getQuantidade();
    }
}

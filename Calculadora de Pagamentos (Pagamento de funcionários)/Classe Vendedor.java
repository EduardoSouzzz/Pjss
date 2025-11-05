public class Vendedor implements Pagavel{

    private String nome;
    private int id;
    private double salarioBase;
    private int totalVendas;
    private int taxaComissao;

    public Vendedor(String nome, int id, double salarioBase, int totalVendas, int taxaComissao) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public int getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(int taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double calcularPagamento() {
        return  salarioBase + ( totalVendas * taxaComissao );
    }
}

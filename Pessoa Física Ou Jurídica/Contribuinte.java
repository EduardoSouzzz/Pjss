abstract class Contribuinte  {
    private String nome;
    private Double RendaAnual;

    public Contribuinte(String nome, double rendaAnual) {
        this.setNome(nome);
        this.setRendaAnual(rendaAnual);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return RendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        RendaAnual = rendaAnual;
    }

    public abstract double calcularImposto();

}

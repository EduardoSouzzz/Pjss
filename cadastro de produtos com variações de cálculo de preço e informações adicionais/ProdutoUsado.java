import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{

    private LocalDate dataDeFab;

    public ProdutoUsado(String nome, Double preco, LocalDate dataDeFab) {
        super(nome, preco);
        this.dataDeFab = dataDeFab;
    }

    public LocalDate getDataDeFab() {
        return dataDeFab;
    }

    public void setDataDeFab(LocalDate dataDeFab) {
        this.dataDeFab = dataDeFab;
    }

    @Override
    public String priceTag () {
        return getNome()
                + " $ "
                + String.format("%.2f", getPreco())
                + " (Manufacture date: "
                + dataDeFab.format(DateTimeFormatter.ofPattern("dd/MM/yyyy)"))
                + ")";

    }
}

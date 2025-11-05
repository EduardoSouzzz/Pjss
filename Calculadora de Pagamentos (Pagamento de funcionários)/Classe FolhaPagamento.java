import java.util.ArrayList;

public class FolhaPagamento {

    ArrayList<Pagavel> pg = new ArrayList<>();

    public void novoPagavel(Pagavel p) {
        pg.add(p);
    }

    double total = 0;
    public void TotalGeral() {
         for (Pagavel p : pg) {
             total += p.calcularPagamento();
             System.out.println(total);
         }
    }
}

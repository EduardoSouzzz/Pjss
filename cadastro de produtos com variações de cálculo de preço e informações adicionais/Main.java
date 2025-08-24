import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MC8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("PRODUCT " + (i+1) + " DATA: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char cr = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();


            if (cr == 'c') {
                list.add(new Produto(name, price));

            } else if (cr == 'u') {
                System.out.println("Data de Fabricação (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new ProdutoUsado(name, price, date));

            } else {
                System.out.print("Taxa de importação: ");
                double taxa = sc.nextDouble();
                list.add(new ProdutoImportado(name, price, taxa));
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO: ");
        for (Produto prod : list) {
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MC8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax player # " + (i + 1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char letra = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Renda Anual: ");
            double renda = sc.nextDouble();


            if (letra == 'i') {
                System.out.print("Despesas com Saúde: ");
                double despesas = sc.nextDouble();
                list.add(new PessoaFisica(nome, renda, despesas));

            } else {
                System.out.print("Número de Funcionarios: ");
                int func = sc.nextInt();
                list.add(new PessoaJuridica(nome, renda, func));

            }
        }
        System.out.println("TAXES PAID: ");
        double totalImposto = 0.0;
        for (Contribuinte c : list) {
            double imposto = c.calcularImposto();
            System.out.println(c.getNome() + " $ " + String.format("%.2f", imposto));
            totalImposto += imposto;
        }
        System.out.println("Nota de Imposto: $ " + String.format("%.2f", totalImposto));
        sc.close();
    }
}

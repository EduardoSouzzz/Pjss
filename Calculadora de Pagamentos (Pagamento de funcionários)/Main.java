import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pagavel> pagavels = new ArrayList<>();

        System.out.print("Quantas Pessoas dessa empresa vai ser cadastrada?: ");
        int pessoas = sc.nextInt();

        for (int i = 0; i < pessoas; i++) {
            System.out.print("Digite a(s) função(es), se você é Funcionario(F)," +
                    "Freelancer(R) ou Vendedor(V): ");

            char cr = sc.next().charAt(0);

            System.out.print("Digite seu nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            if (cr == 'F') {

                System.out.print("Digite seu ID: ");
                int id = sc.nextInt();

                System.out.print("Digite seu salário base: ");
                double salarioFixo = sc.nextDouble();

                pagavels.add(new Funcionario(nome, id, salarioFixo));

                } else if (cr == 'R') {

                System.out.print("Digite suas horas trabalahadas: ");
                int hrsTrabalahadas = sc.nextInt();

                System.out.print("Digite o valor que vc ganha por Horas: ");
                double valorGanhoPorHrs = sc.nextDouble();

                pagavels.add(new Freelancer(nome, hrsTrabalahadas, valorGanhoPorHrs));

            } else {
                System.out.print("Digite seu ID: ");
                int id = sc.nextInt();

                System.out.print("Digite seu salário base: ");
                double salarioBase = sc.nextDouble();

                System.out.print("Digite o seu total de vendas: ");
                int totalVendas = sc.nextInt();

                System.out.print("Digite sua taxa de comissão: ");
                int taxa = sc.nextInt();

                pagavels.add(new Vendedor(nome, id, salarioBase, totalVendas, taxa));
            }
        }
        System.out.println();
        for (Pagavel p : pagavels) {
            System.out.println("Pagamento total: R$ " + p.calcularPagamento());
        }
        sc.close();
    }
}

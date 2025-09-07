import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();
        System.out.print("Digite quantos funcionarios tem: ");
        int func = sc.nextInt();

        for (int i = 0; i < func; i++) {
            System.out.println("Funcionario: " + (i + 1 ) );
            System.out.println("CLT ou PJ? (C/P): ");
            char letra = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salario Base: ");
            double salario = sc.nextDouble();

            if (letra == 'c') {
                System.out.println("Você receberá 10% de bônus!");
                list.add(new CLT(nome, salario));
                System.out.println();
            } else if (letra == 'p') {
                System.out.println("Você receberá 5% de taxa administrativa!");
                list.add(new PJ(nome, salario));
            } else {
                System.out.println("Tipo invalido, Digite se é CLT ou PJ (C/P) ");
        }
        }
        System.out.println("\n=== Pagamento dos Funcionários ===");
        for (Funcionario f : list) {
            System.out.println(f);
        }

        sc.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        System.out.print("Quantos produtos serão cadastrados?: ");
        int produtoCad = sc.nextInt();

        for (int i = 0; i < produtoCad; i++) {
            System.out.println("Produto: " + (i + 1));
            System.out.print("O produto é c ou i?: ");
            char CouI = sc.next().charAt(0);


            if (Character.toLowerCase(CouI) == 'c') {
                System.out.print("Digite o nome do produto: ");
                sc.nextLine();
                String nome = sc.nextLine();

                System.out.print("Digite o preço do produto: ");
                double preco = sc.nextDouble();

                System.out.print("Digite a quantidade em estoque: ");
                sc.nextLine();
                int quantidade = sc.nextInt();


                produtos.add(new Produto(nome, preco, quantidade));


            } else {
                System.out.print("Digite o nome do produto importado: ");
                sc.nextLine();
                String nome = sc.nextLine();

                System.out.print("Digite o preco do produto importado: ");
                double preco = sc.nextDouble();

                System.out.print("Digite a quantidade de produto importado: ");
                sc.nextLine();
                int quantidade = sc.nextInt();

                System.out.print("Digite a Taxa de Importação: ");
                sc.nextLine();
                double taxa = sc.nextDouble();

                produtos.add(new ProdutoImportado(nome, preco, quantidade, taxa));
            }
        }
        double totalEstoque = 0;
        for (Produto p : produtos) {
            if (p instanceof ProdutoImportado) {
                totalEstoque += ((ProdutoImportado) p).valorTotalImportado();
            } else {
                totalEstoque += p.valorTotalemEstoque();
            }
        }
        System.out.println("Valor total do estoque: R$ " + totalEstoque);
        System.out.println();

        System.out.println("Deseja Atualizar o Estoque?: ");
        char atualizar = sc.next().charAt(0);
        if (Character.toLowerCase(atualizar) == 's') {
            System.out.print("Digite o nome do produto para atualizar o estoque: ");
            String nomeBusca = sc.nextLine();

            for (Produto p : produtos) {
                if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                    System.out.print("Deseja adicionar ou remover unidades? (a/r): ");
                    char escolha = sc.next().charAt(0);

                    System.out.print("Quantas unidades? ");
                    int qtd = sc.nextInt();

                    if (Character.toLowerCase(escolha) == 'a') {
                        p.AdicionarProdutos(qtd);
                    } else {
                        p.RemoverProduto(qtd);
                    }
                    System.out.println("Estoque atualizado: " + p);
                }
            }
        } else {
            System.out.println("Certo, obrigado por participar!");
        }
    }
}

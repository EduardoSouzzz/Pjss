import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProdutoRepository pr = new ProdutoRepository();
        ProdutoService ps = new ProdutoService(pr);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Criar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Deletar");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade de Estoque: ");
                    int estoque = sc.nextInt();

                    ps.criarProduto(id, nome, preco, estoque);
                    break;

                case 2:
                    ps.listarProdutos();
                    break;

                case 3:
                    System.out.print("ID: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String novoNome = sc.nextLine();

                    System.out.print("Preço: ");
                    double novoPreco = sc.nextInt();

                    System.out.print("Quantidade de Estoque: ");
                    int novoEstoque = sc.nextInt();

                    ps.atualizarProduto(idAtualizar, novoNome, novoPreco, novoEstoque );
                    break;

                case 4:
                    System.out.print("ID do produto: ");
                    int idDeletar = sc.nextInt();

                    ps.deletarProduto(idDeletar);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}

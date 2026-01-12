import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        CadastroAlunos ca = new CadastroAlunos();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos alunos vc vai cadastrar: ");
        int alunosCad = sc.nextInt();

        for (int i = 0; i < alunosCad; i++) {
            System.out.print("\nDigite a matricula do aluno " + (i + 1) + ": ");
            int matricula = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite a nota final do(a) " + nome + ": ");
            double notaFinal = sc.nextDouble();

            Aluno aluno = new Aluno(matricula, nome, notaFinal);
            ca.adAluno(aluno);
            System.out.println();
        }

        // pergunta se quer add novo aluno no sistema de matricula
        System.out.print("Deseja adicionar um nome aluno?: (s/n) ");
        char resposta = sc.next().toUpperCase().charAt(0);

        if (resposta == 'S') {
            System.out.print("\nDigite a matricula do aluno: ");
            int matricula = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Digite a nota final do(a) " + nome + ": ");
            double notaFinal = sc.nextDouble();

            Aluno aluno = new Aluno(matricula, nome, notaFinal);
            ca.adAluno(aluno);

        } else {
            System.out.println("OK, obrigado por cadastrar!");
        }
        System.out.println();

        // Buscando aluno no sistema
        System.out.print("Deseja buscar aluno(s)? (s/n): ");
        char buscar = sc.next().toUpperCase().charAt(0);

        if (buscar == 'S') {
            System.out.print("Digite a matrícula para busca: ");
            int mat = sc.nextInt();

            Aluno a = ca.buscarAluno(mat);
            if (a != null) {
                System.out.println(
                        "Matrícula: " + a.getMatricula() +
                                " | Nome: " + a.getNome() +
                                " | Nota: " + a.getNotaFinal()
                );
            } else {
                System.out.println("Aluno não encontrado.");
            }
        }

        // Remover alunos
        System.out.print("Deseja remover aluno(s)? (s/n) ");
        char removerOuNao = sc.next().toUpperCase().charAt(0);

        if (removerOuNao == 'S') {
            System.out.print("Digite a matrícula do aluno a remover: ");
            int matRemover = sc.nextInt();

            Aluno removido = ca.buscarAluno(matRemover);
            if (removido != null) {
                ca.removerAluno(matRemover);
                System.out.println("Aluno removido com sucesso.");
            } else {
                System.out.println("Matrícula não encontrada.");
            }
        }
      
        System.out.println("=== Alunos cadastrados no sistema ===");
        ca.listarAlunos();

    }
}

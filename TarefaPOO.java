public class Tarefa {

    private String nome;
    private String descricao;
    private String dataLimite;
    private boolean concluida;

    public Tarefa(String nome, String descricao, String dataLimite, boolean concluida) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.concluida = concluida;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public String getDataLimite() {
        return dataLimite;
    }
    public void setDataLimite(String dataLimite) {
        this.dataLimite = dataLimite;
    }


    public boolean isConcluida() {
        return concluida;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }




    // Método;
    public void marcarComoConcluida() {
        this.concluida = true;
    }


    // toString
    public String toString() {
        return "Nome: " + nome +
                "\nDescrição: " + descricao +
                "\nData Limite: " + dataLimite +
                "\nConcluida: " + (concluida ? "Sim" : "Não");
    }
}


// Class MAIN:

import java.util.ArrayList;
import java.util.Scanner;

public class MC10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Tarefa> tf = new ArrayList<>();

        int opcao;
        do {
            System.out.println("1. Adicionar uma Tarefa.");
            System.out.println("2. Listar todas as Tarefas cadastradas.");
            System.out.println("3. Marcar uma tarefa como concluida.");
            System.out.println("4. Sair do Sistema.");

            System.out.println();

            System.out.print("Digite uma opção de 1 a 4 naquilo que deseja fazer: ");
            opcao = sc.nextInt();

            System.out.println();

            if (opcao < 1 || opcao > 6) {
                System.out.print("Usuario, Essa Opção Não Existe... Digite uma opção de 1 a 4: ");
                continue;
            }

            switch (opcao) {
                case 1:
                    sc.nextLine();

                    System.out.print("Digite o nome da tarefa: ");
                    String nomeTarefa = sc.nextLine();


                    System.out.print("Digite a descrição da Tarefa: ");
                    String descricaoTarefa = sc.nextLine();


                    System.out.print("Digite a data limite da tarefa: ");
                    String dataLimiteTarefa = sc.nextLine();


                    Tarefa novaTarefa = new Tarefa(nomeTarefa, descricaoTarefa,
                            dataLimiteTarefa, false);
                    tf.add(novaTarefa);


                    System.out.println("Tarefa adicionada com sucesso: ");
                    break;


                case 2:
                    if (tf.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < tf.size(); i++) {
                            System.out.println("Tarefa #" + i);
                            System.out.println(tf.get(i));
                            System.out.println("---------------------");
                        }
                    }
                    break;


                case 3:
                    if (tf.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada");

                    } else {
                        System.out.println("Digite o número da tarefa que deseja" +
                                " marcar como concluida: ");
                        int tarefaConcluida = sc.nextInt();

                        if (tarefaConcluida >=0 && tarefaConcluida < tf.size()) {
                            tf.get(tarefaConcluida).marcarComoConcluida();
                            System.out.println("Tarefa marcada como concluida!");

                        } else {
                            System.out.println("Número inválido. ");
                        }
                    }


            }

        } while (opcao != 4);

    }
}

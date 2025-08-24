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

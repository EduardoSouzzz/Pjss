import java.util.HashMap;
import java.util.Map;

public class CadastroAlunos {

    private Map<Integer, Aluno> alunos = new HashMap<>();

    public void adAluno(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }

    public void removerAluno(Integer matricula) {
        alunos.remove(matricula);
    }

    public Aluno buscarAluno(Integer matricula) {
        return alunos.get(matricula);
    }

    public void listarAlunos() {
        for (Aluno a : alunos.values()) {
            System.out.println(
                    "Matricula: " + a.getMatricula() +
                    " | Nome: " + a.getNome() +
                    " | Nota Final: " + a.getNotaFinal()
            );
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private List<Produto> lista = new ArrayList<>();

    public void salvar(Produto produto) {
        lista.add(produto);
    }

    public List<Produto> listar() {
        return lista;
    }

    public Produto buscarPorId(int id) {
        for (Produto i : lista) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public void deletar(int id) {
        Produto produto = buscarPorId(id);
        if (produto != null) {
            lista.remove(produto);
        }
    }
}

import java.util.List;

public class ProdutoService {

    private ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public void criarProduto(int id, String nome, double preco, int estoque) {
        if (nome.isEmpty() || preco <= 0 || estoque < 0) {
            System.out.println("Dados inválidos!");
            return;
        }
        Produto produto = new Produto(id, nome, preco, estoque);
        repository.salvar(produto);
        System.out.println("Produto criado!");
    }

    public void listarProdutos() {
        List<Produto> produto = repository.listar();

        if (produto.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            produto.forEach(System.out::println);
        }
    }

    public void atualizarProduto(int id, String novoNome, double novoPreco, int novoEstoque) {
        Produto produto = repository.buscarPorId(id);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        produto.setNome(novoNome);
        produto.setPreco(novoPreco);
        produto.setEstoque(novoEstoque);
        System.out.println("Estoque atualizado!");
    }

    public void deletarProduto(int id) {
        Produto produto = repository.buscarPorId(id);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }
        repository.deletar(id);
        System.out.println("Produto deletado!");
    }
}

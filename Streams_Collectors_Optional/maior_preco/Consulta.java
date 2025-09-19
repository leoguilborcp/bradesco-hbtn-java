import java.util.*;
import java.util.stream.*;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream()
                .filter(produto -> produto.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream().sorted(Comparator.comparing(Produto::getPreco).reversed())
                .findFirst().orElse(null);
    }
}

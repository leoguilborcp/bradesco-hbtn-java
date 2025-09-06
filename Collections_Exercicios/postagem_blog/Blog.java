import java.util.*;
public class Blog{
    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        for (Post item : posts) {
            if (item.compareTo(post) == 0) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post post : posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsPorAutor = new TreeSet<>();
        for (Post post : posts) {
            if (post.getAutor().compareTo(autor) == 0) {
                postsPorAutor.add(post);
            }
        }
        return postsPorAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria ) {
        Set<Post> postsPorCategoria = new TreeSet<>();
        for (Post post : posts) {
            if (post.getCategoria().equals(categoria)) {
                postsPorCategoria.add(post);
            }
        }
        return postsPorCategoria;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new TreeMap<>();
        for (Post post : posts) {
            Categorias categoria = post.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }
        return contagem;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorAutor = new TreeMap<>();
        for (Post post : posts) {
                postsPorAutor.putIfAbsent(post.getAutor(), new TreeSet<>());
                postsPorAutor.get(post.getAutor()).add(post);
        }
        return postsPorAutor;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
    Map<Categorias, Set<Post>> postsPorCategoria = new HashMap<>();
    for (Post post : posts) {
        Categorias categoria = Categorias.valueOf(post.getCategoria().getDescricao().toUpperCase());
        postsPorCategoria.putIfAbsent(categoria, new TreeSet<>());
        postsPorCategoria.get(categoria).add(post);
    }
    return postsPorCategoria;
}
}
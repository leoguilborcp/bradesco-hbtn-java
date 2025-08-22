import exceptions.*;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        if (titulo == null || titulo.trim().isEmpty() || titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo invalido");
        }
        if (autor == null || autor.trim().isEmpty() || autor.split(" ").length < 2) {
            throw new AutorInvalidoException("Autor invalido");
        }
        if (preco <= 0) {
            throw new LivroInvalidoException("Preco invalido");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // Getters e Setters 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if (titulo == null || titulo.trim().isEmpty() || titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo invalido");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws LivroInvalidoException {
        if (autor == null || autor.trim().isEmpty() || autor.split(" ").length < 2) {
            throw new LivroInvalidoException("Autor invalido");
        }
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        this.preco = preco;
    }
}

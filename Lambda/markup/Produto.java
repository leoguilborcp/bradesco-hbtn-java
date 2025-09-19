import java.util.function.*;
public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10;
    public Supplier<Double> precoComMarkup;
    public Consumer<Double> atualizarMarkup;

    public Produto( double preco,String nome) {
        this.nome = nome;
        this.preco = preco;

        this.precoComMarkup = () -> preco + (preco * percentualMarkup / 100);
        this.atualizarMarkup = novoMarkup -> percentualMarkup = novoMarkup;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
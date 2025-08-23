import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();
    private String filename;

    public Estoque(String fileName) {
        this.filename = fileName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String linha = reader.readLine();
            while (linha != null) {
                String[] dados = linha.split(",");
                Produto produto = new Produto(Integer.parseInt(dados[0]), dados[1], Integer.parseInt(dados[2]), Double.parseDouble(dados[3]));
                produtos.add(produto);
                linha = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {

        Produto produto = new Produto(gerarId(), nome, quantidade, preco);
        produtos.add(produto);
        gravaArquivo();
    }

    public void excluirProduto(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
        gravaArquivo(); 
    }

    public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getId() == idAtualizar) {
                produto.setQuantidade(novaQuantidade);
                break;
            }
        }
        gravaArquivo();
    }

    public void exibirEstoque(){
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }
    private int gerarId() {
        return (produtos.size() > 0 ? produtos.get(produtos.size()-1).getId() : 0) + 1;
    }

    private void gravaArquivo() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (Produto produto : produtos) {
                writer.write(produto.getId() + "," + produto.getNome() + "," + produto.getQuantidade() + "," + produto.getPreco());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao gravar o arquivo: " + e.getMessage());
        }
    }
}
import produtos.Produto;
public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;
    private double total;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public void calcularTotalSemDesconto() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        this.total = total;
    }

    public double calcularDesconto(){
        return this.total * percentualDesconto * 0.01;
    }
    
    public double calcularTotal() {
        return this.total - calcularDesconto();
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }
    public void apresentarResumoPedido(){
        
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : itens) {
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n", item.getProduto().getClass().getSimpleName(), item.getProduto().getTitulo(), item.getProduto().obterPrecoLiquido(), item.getQuantidade(), item.getProduto().obterPrecoLiquido() * item.getQuantidade());
        
        }
        calcularTotalSemDesconto();
        System.out.println("----------------------------");
        System.out.printf("DESCONTO:  %.2f\n", calcularDesconto() );       
        System.out.printf("TOTAL PRODUTOS: %.2f\n", this.total);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
    }
}
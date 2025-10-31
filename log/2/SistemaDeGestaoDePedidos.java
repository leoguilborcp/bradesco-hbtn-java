import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.HashMap;
import java.util.Map;


public class SistemaDeGestaoDePedidos {


    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(SistemaDeGestaoDePedidos.class);


    // Simulação de um banco de dados simples com mapa de pedidos
    private static final Map<Integer, Pedido> pedidos = new HashMap<>();


    public static void main(String[] args) {


        logger.info("Sistema de Gestão de Pedidos iniciado.");


        // Criando pedidos
        criarPedido(1, "Produto A", 100.00);
        criarPedido(2, "Produto B", 50.00);


        // Pagamento de pedidos
        pagarPedido(1, 100.00);
        pagarPedido(2, 60.00); // Pagamento incorreto


        // Cancelando pedidos
        cancelarPedido(1);
        cancelarPedido(3); // Pedido inexistente


        logger.info("Sistema de Gestão de Pedidos finalizado.");
    }


    // Função para criar um pedido
    private static void criarPedido(int id, String nomeProduto, double valor) {
        if (pedidos.containsKey(id)) {
            logger.error("Erro ao processar o pagamento {}: já existe um pedido com este ID.", id);
        } else {
            Pedido novoPedido = new Pedido(id, nomeProduto, valor);
            pedidos.put(id, novoPedido);
            logger.info("Pedido {} criado com sucesso: Produto={}, Valor={}", id, nomeProduto, valor);
        }
    }


    // Função para pagar um pedido
    private static void pagarPedido(int id, double valorPago) {
        Pedido pedido = pedidos.get(id);
        logger.info("Iniciando o processamento do pagamento {}", id);
        if (pedido == null) {
            logger.error("Erro ao processar o pagamento {}: Pedido inexistente.", id);
            return;
        }
        if (pedido.isPago()) {
            logger.warn("Pagamento {} já foi realizado anteriormente.", id);
            return;
        }
        if (Double.compare(pedido.getValor(), valorPago) == 0) {
            pedido.setPago(true);
            logger.info("Pagamento {} processado com sucesso.", id);
        } else {
            logger.error("Erro ao processar o pagamento {}: Falha na transação.", id);
        }
    }


    // Função para cancelar um pedido
    private static void cancelarPedido(int id) {
        Pedido pedido = pedidos.get(id);
        if (pedido == null) {
            logger.error("Erro ao cancelar o pedido {}: Pedido inexistente.", id);
            return;
        }
        if (pedido.isPago()) {
            logger.warn("Não é possível cancelar o pedido {} pois já foi pago.", id);
            return;
        }
        pedidos.remove(id);
        logger.info("Pedido {} cancelado com sucesso.", id);
    }
}
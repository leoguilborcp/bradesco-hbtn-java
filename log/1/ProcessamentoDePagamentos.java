import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Random;


public class ProcessamentoDePagamentos {


    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);


    public static void main(String[] args) {

        logger.info("Iniciando o processamento de pagamentos...");

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            logger.error("Thread interrompida durante o processamento do pagamento {}", i, e);
            Thread.currentThread().interrupt();
            break;
            }

            int estado = random.nextInt(3); // 0: sucesso, 1: falha, 2: pendente

            switch (estado) {
            case 0:
                logger.info("Pagamento {} processado com sucesso.", i);
                break;
            case 1:
                logger.error("Falha no processamento do pagamento {}.", i);
                break;
            case 2:
                logger.warn("Pagamento {} está pendente.", i);
                break;
            }
        }
    // implemente o codigo necessario para resolucao do problema
    }
}
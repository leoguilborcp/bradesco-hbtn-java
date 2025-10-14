import java.util.LinkedList;

public class Fila {
       private LinkedList<Integer> itens = new LinkedList<>(); // -1 indica que o buffer está vazio


    // Método para o produtor colocar um item no buffer
    public synchronized void adicionar(int item) throws InterruptedException {
        // Se o buffer já tem um item, espera o consumidor consumi-lo
        while (this.itens.size() == 10) {
            wait(); // Espera o consumidor consumir o item
        }


        // Coloca o item no buffer
        this.itens.add(item);
        System.out.println("Produtor produziu: " + item);

        // Notifica o consumidor que o item foi produzido
        notifyAll();
    }


    // Método para o consumidor retirar um item do buffer
    public synchronized int retirar() throws InterruptedException {
        // Se o buffer estiver vazio, espera o produtor produzir um item
        while (this.itens.size() == 0) {
            wait(); // Espera o produtor produzir um item
        }


        // Retira o item do buffer
        int consumido = this.itens.removeFirst();
        System.out.println("Consumidor consumiu: " + consumido);


        // Notifica o produtor que o buffer está vazio
        notifyAll();


        return consumido;
    } 
}

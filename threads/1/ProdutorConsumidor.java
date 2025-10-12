public class ProdutorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Produtor produtor = new Produtor(buffer);
        Consumidor consumidor = new Consumidor(buffer);

        produtor.start();
        consumidor.start();

        // Espera as threads terminarem antes de finalizar a thread principal
        try {
            produtor.join();
            consumidor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Produtor extends Thread {
    private Fila fila;


    public Produtor(Fila fila) {
        this.fila = fila;
    }


    @Override
    public void run() {
        try {while(true){
                int i = (int) (Math.random() * 100) + 1;
                fila.adicionar(i);  // O produtor coloca os itens na fila
                Thread.sleep(1000);   // Simula o tempo para produzir um item
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
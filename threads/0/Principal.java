public class Principal {

    public static void main(String[] args) {
        Contador contador = new Contador();
        // Criando uma nova thread usando uma classe que implementa Runnable
        Thread thread1 = new ThreadContador(contador);
        thread1.start();

        // Criando uma nova thread usando uma expressão lambda
        Thread thread2 = new ThreadContador(contador);
        thread2.start();

        // Espera as threads terminarem antes de finalizar a thread principal
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valor final do contador: " + contador.getContagem());
    }
    
}

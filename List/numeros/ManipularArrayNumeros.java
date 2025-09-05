import java.util.*;
public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, int numero) {
        return numeros.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> numeros, int numero) {
        if (buscarPosicaoNumero(numeros, numero) != -1) {
            System.out.println("Numero jah contido na lista");
            return;
        }
        numeros.add(numero);
    }

    public static void removerNumero(List<Integer> numeros, int numero)  {
        int posicao = buscarPosicaoNumero(numeros, numero);
        if (posicao == -1) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
        numeros.remove(posicao);
    }

    public static void substituirNumero(List<Integer> numeros, int numeroAntigo, int numeroNovo) {
        int posicao = buscarPosicaoNumero(numeros, numeroAntigo);

        if (posicao == -1) {
            numeros.add(numeroNovo);
            return;
        }
        numeros.set(posicao, numeroNovo);
    }
}
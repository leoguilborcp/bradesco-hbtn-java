import java.util.Scanner;


public class ArrayExercicio {


    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;


        // Preenchendo o array com números fornecidos pelo usuário
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < tamanhoArray; i++) {

            System.out.printf("Digite o número %d: ", i + 1);
            try{
                numeros[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
                i--; // Decrementa i para repetir a iteração
                continue;
            }
            builder.append(String.format("%d ", numeros[i]));
            soma += numeros[i];
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
            
        // Exibindo os resultados
        System.out.println("Conteúdo do array:");
        System.out.println(builder.toString());
        System.out.println("Soma de todos os números: " + soma);
        System.out.println("Maior número no array: " + maiorNumero);

        // Fechando o scanner
        scanner.close();
    }
}
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


        // Preenchendo o array com n�meros fornecidos pelo usu�rio
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 n�meros inteiros:");
        for (int i = 0; i < tamanhoArray; i++) {

            System.out.printf("Digite o n�mero %d: ", i + 1);
            try{
                numeros[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inv�lida. Por favor, digite um n�mero inteiro.");
                scanner.next(); // Limpa a entrada inv�lida
                i--; // Decrementa i para repetir a itera��o
                continue;
            }
            builder.append(String.format("%d ", numeros[i]));
            soma += numeros[i];
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
            
        // Exibindo os resultados
        System.out.println("Conte�do do array:");
        System.out.println(builder.toString());
        System.out.println("Soma de todos os n�meros: " + soma);
        System.out.println("Maior n�mero no array: " + maiorNumero);

        // Fechando o scanner
        scanner.close();
    }
}
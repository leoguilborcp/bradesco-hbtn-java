import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.Scanner;


 public class FileWritingExercise {
     public static void main(String[] args)  {
         Scanner scanner = new Scanner(System.in);


         // Solicita o nome do arquivo
         System.out.print("Digite o nome do arquivo (com extensão .txt): ");
         String fileName = scanner.nextLine();
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
             System.out.println("Digite o conteúdo a ser escrito no arquivo (digite 'sair' para finalizar):");
             String linha;
             while (true) {
                    linha = scanner.nextLine();
                 writer.write(linha);
                 writer.newLine();
                 if (linha.trim().equalsIgnoreCase("sair")) {
                     break;
                 }
             }
         
         
         writer.close();
         } catch (IOException e) {
             System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
         }

         scanner.close();
     }
 }
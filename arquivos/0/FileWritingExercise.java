import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.Scanner;


 public class FileWritingExercise {
     public static void main(String[] args)  throws IOException {
         Scanner scanner = new Scanner(System.in);


         // Solicita o nome do arquivo
         System.out.print("Digite o nome do arquivo (com extensão .txt): ");
         String fileName = scanner.nextLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
             System.out.println("Digite o conteúdo a ser escrito no arquivo (digite 'sair' para finalizar):");
             String linha;
             while (!(linha = scanner.nextLine()).equalsIgnoreCase("sair")) {
                 writer.write(linha);
                 writer.newLine();
             }
         
         
         writer.close();

         scanner.close();
     }
 }
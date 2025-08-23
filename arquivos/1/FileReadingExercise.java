import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura
        System.out.println("Conteúdo do arquivo '" + fileName + "':");
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String linha = reader.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        System.out.println("Leitura do arquivo concluída.");
    }
}
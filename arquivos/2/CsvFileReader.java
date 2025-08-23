import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CsvFileReader {
    public static void main(String[] args) {
        String fileName = "funcionarios.csv"; // Nome do arquivo fixo para leitura
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String[] colunas = {"Funcionário","Idade","Departamento","Salarial"};

            String linha = reader.readLine();
           
            while (linha != null) {
                String[] valores = linha.split(",");
                int i=0;
                for (String coluna : colunas) {
                    System.out.println(coluna + ": " + valores[i]);
                    i++;
                }
                System.out.println("------------------------");
                linha = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        System.out.println("Leitura do arquivo concluída.");
    }
}
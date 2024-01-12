import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedR {

    public static void main(String[] args) {
        
        String filePath = "example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // ler um arquivo em pedaços (chunks) de 20 caracteres por vez
            char[] buffer = new char[20];
            int bytesRead;

            while ((bytesRead = reader.read(buffer)) != -1) {
                processChunk(buffer, bytesRead);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void processChunk(char[] chunk, int bytesRead) {

        System.out.println("Chunk: ");

        for (int i = 0; i < bytesRead; i++) {
            System.out.print(chunk[i]);
        }

        System.out.println();

    }

}



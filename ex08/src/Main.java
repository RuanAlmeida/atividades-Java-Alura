import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String busca = "Conteúdo a ser gravado no arquivo.";

        FileWriter escrita = new FileWriter("arquivo.txt");
        escrita.write(busca);
        escrita.close();

    }
}

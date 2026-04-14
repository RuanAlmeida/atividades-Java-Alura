import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Titulo titulo1 = new Titulo();

        FileWriter escrita = new FileWriter("filme.txt");

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        titulo1.setTempoDeTitulo(100);
        titulo1.setDiretor("Ruan Almeida");
        titulo1.setName("As aventuras de um programador");

        String tituloGson = gson.toJson(titulo1);



        System.out.println(tituloGson);
    }
}

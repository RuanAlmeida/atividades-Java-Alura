import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.IllegalFormatException;
import java.util.Scanner;

public class Api {
    public static void main(String[] args) throws IOException, InterruptedException {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Scanner busca = new Scanner(System.in);
        String cep = " ";
        System.out.println("Digite um CEP: ");
        cep = busca.nextLine();
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";

        try {


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        ApiSerializada novaApi = gson.fromJson(json, ApiSerializada.class);
        System.out.println(novaApi);

            FileWriter armazenamento = new FileWriter("CEPs.txt");
            armazenamento.write(gson.toJson(novaApi));
            armazenamento.close();

        } catch (JsonSyntaxException e){
            System.out.println("Error - digite apenas números");
        }



    }
}

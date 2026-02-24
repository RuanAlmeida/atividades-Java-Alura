
import com.google.gson.Gson;

import com.google.gson.GsonBuilder;
import modelos.Pessoa;

public class Main {
    public static void main(String[] args) {


        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gosn = new GsonBuilder()
                .setLenient()
                        .create();
        Pessoa pessoa = gosn.fromJson(jsonPessoa, Pessoa.class);
        System.out.println("Objeto Pessoa: " + pessoa);

    }
}

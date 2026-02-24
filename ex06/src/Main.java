import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.Pessoa;

public class Main {
    public static void main(String[] args) {


        String jsonRecebido = """
                {
                    "nome": "Ruan Almeida",
                    "idade": 19,
                    "cidade": "São Paulo"
                }
                """;
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Pessoa pessoa = gson.fromJson(jsonRecebido, Pessoa.class);
        System.out.println(pessoa);
        System.out.println(pessoa.cidade());




    }
}

<<<<<<< HEAD
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate dataDaPrimeiraParcela = localDate.of(2025, 5, 30);
        LocalDate dataDaSegundaParcela = dataDaPrimeiraParcela.plusDays(30);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd--MM--YY");

        System.out.println(localDate);
        System.out.println(dataDaPrimeiraParcela + " --- " + dataDaSegundaParcela);

        if (dataDaPrimeiraParcela.equals(localDate.now())){
            System.out.println("Data de pagamento é hoje");
        } else {
            System.out.println("Ainda nao esta na data de pagamento");
            System.out.println(localDate.now());
            System.out.println(dataDaPrimeiraParcela);
        }

        System.out.println(dataDaPrimeiraParcela.format(formato));
    }
}
=======

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
>>>>>>> 3548f3ec5bbeb924ba8410edd58210dff39c87e0

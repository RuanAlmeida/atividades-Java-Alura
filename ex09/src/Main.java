import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();


        titulo1.setTempoDeTitulo(100);
        titulo1.setDiretor("Ruan Almeida");
        titulo1.setName("As aventuras de um programador");

        String tituloGson = gson.toJson(titulo1);

        System.out.println(tituloGson);
    }
}

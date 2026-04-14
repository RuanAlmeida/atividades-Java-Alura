import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
    try {

        FileWriter docs = new FileWriter("docs.json");

        Veiculo v1 = new Veiculo();
        v1.setAno(2020);
        v1.setCor("#256654");
        v1.setModelo("Corolla");

        String v2 = gson.toJson(v1);
        System.out.println(v2);
        docs.write(v2);

        Veiculo v3 = new Veiculo();
        v3.setModelo("Civc");
        v3.setAno(2019);
        v3.setCor("#6151");

        String v4 = gson.toJson(v3);
        System.out.println(v4);
        docs.write(v4);


        docs.close();
        } catch (IOException e) {
        throw new RuntimeException(e);
    }


    }
}

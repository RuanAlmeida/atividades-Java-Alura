import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        Veiculo v1 = new Veiculo();
        v1.setAno(2020);
        v1.setCor("#256654");
        v1.setModelo("Corolla");

        String v2 = gson.toJson(v1);
        System.out.println(v2);

    }
}

<<<<<<< HEAD
import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args) {
    // Codigo Main
        System.out.println(formatPhoneNumber("11943993960"));
        System.out.println(upper("Ola, TUDO bem?"));
        System.out.println(lower("OLA, TUDO bem?"));
        System.out.println(email("Ola, meu email é ruanalmeidasantos@gmail.com"));

    }
    public static String formatPhoneNumber(String phone){
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        if (matcher.matches()){
            return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }
        return  "invalid Phone Number";
    }


    public static String upper(String text){
        String regex = "\\w".toUpperCase();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        return text;
    }

    public static String lower(String text){
        String regex = "\\w".toLowerCase();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        return text;
    }

    public static String email(String msg) {
        String texto = "Meu email é ruanalmeidasantos@gmail.com";
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");
        Matcher matcher = pattern.matcher(texto);

        if (matcher.find()) {
            System.out.println("Seu email é: " + matcher.group());

        }
        return texto;
    }
}
=======
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite qual receita deseja ver: ");
        var busca = leitura.nextLine();

        String endereco = "www.themealdb.com/api/json/v1/1/search.php?s=" + busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
>>>>>>> 3548f3ec5bbeb924ba8410edd58210dff39c87e0

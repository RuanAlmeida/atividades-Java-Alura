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
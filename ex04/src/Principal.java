import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Integer> listaDeNumeros = new ArrayList<>();

        listaDeNumeros.add(15);
        listaDeNumeros.add(20);
        listaDeNumeros.add(80);
        listaDeNumeros.add(1);

        Collections.sort(listaDeNumeros);
        System.out.println(listaDeNumeros);

    }
}

import Modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("D"));
        listaTitulos.add(new Titulo("A"));
        listaTitulos.add(new Titulo("B"));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.nome);
        }
    }
}

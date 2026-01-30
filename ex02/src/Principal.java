import modelos.Animal;
import modelos.Cachorro;
import modelos.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Ruan", 19, "1452368899", "ruanalmeida.contato@gmail.com");
        Pessoa p2 = new Pessoa("Ricardo", 20, "1547899655", "ricardo.pereira@gmail.com");
        listaPessoas.add(p1);
        listaPessoas.add(p2);

        for (Pessoa item: listaPessoas){
            System.out.println(item);
        }



        ArrayList<Animal> listaDeAnimais = new ArrayList<>();

        Animal c1 = new Cachorro("vira-lata", 6, 14);
        Animal c3 = new Cachorro("lata-vira", 14, 22);
        System.out.println(c3.getIdade());

        listaDeAnimais.add(c1);
        listaDeAnimais.add(c3);


        for (Animal item : listaDeAnimais) {
            System.out.println(item);
            }



    }
}

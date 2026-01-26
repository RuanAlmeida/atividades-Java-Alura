import modelos.Produto;
import modelos.ProdutoPericivel;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Geladeira", 1900, 5);
        Produto produto2 = new Produto("Fogão", 999, 14);
        ArrayList<Produto> listaObjetos = new ArrayList<>();
        listaObjetos.add(produto2);
        listaObjetos.add(produto1);

        System.out.println(listaObjetos.get(0).toString());
        System.out.println(listaObjetos.size());

        ProdutoPericivel produto3 = new ProdutoPericivel("molho de tomate", 8, 27, "10-01-2026");


        listaObjetos.add(produto3);
        System.out.println(listaObjetos.get(2));
    }

}

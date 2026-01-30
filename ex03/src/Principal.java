import modelos.Produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Produto p1 = new Produto("Baralho");
        p1.setPreco(20);
        Produto p2 = new Produto("Relogio");
        p2.setPreco(40);
        Produto p3 = new Produto("lixeira");
        p3.setPreco(60);


        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);


        double somaTotal = 0;
        for (Produto produto : listaDeProdutos){
            somaTotal += produto.getPreco();
        }

        double media = somaTotal / listaDeProdutos.size();
        System.out.println("Media dos produtos do carrinho é: " + media);




    }
}

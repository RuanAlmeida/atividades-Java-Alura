package modelos;

public class Produto {

    private String name;
    private double preco;
    private int qtd;

    public Produto(String name, double preco, int qtd) {
        this.name = name;
        this.preco = preco;
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Produto " +
                " name: " + name  +
                ", preco: " + preco +
                ", qtd: " + qtd +
                " ";
    }
}

package modelos;

public class ProdutoPericivel extends Produto{

    private String dataDeValidade;

    public ProdutoPericivel(String name, double preco, int qtd, String dataDeValidade) {
        super(name, preco, qtd);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de validade: " + this.dataDeValidade;
    }
}

package modelos;

public class Cachorro extends Animal{

    private int tamanhoDaPata;

    public Cachorro(String raca, int idade, int tamanhoDaPata) {
        super(raca, idade);
        this.tamanhoDaPata = tamanhoDaPata;
        }

    public int getTamanhoDaPata() {
        return tamanhoDaPata;
    }


    @Override
    public String toString() {
        return super.toString() + "Cachorro{" +
                "tamanhoDaPata=" + tamanhoDaPata +
                '}';
    }


}
